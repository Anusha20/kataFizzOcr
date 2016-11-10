package kata.fizz;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * 
 * @author Anusha
 *
 */
public class KataOcr {

	static DigitsDetector digitsDetector = new DigitsDetector();

	public static void main(String[] args) throws IOException {
		Charset encoding = Charset.defaultCharset();
		for (String filename : args) {
			ArrayList<String> lines = FileParser.handleFile(filename, encoding);
			printValidity(lines);

		}
	}

	/**
	 * validates that the numbers read are in fact valid account numbers. prints
	 * Valid or Invalid based on the check sum
	 * 
	 * @param lines
	 */
	private static void printValidity(ArrayList<String> lines) {
		ArrayList<Integer[]> accountNumbers;
		try {
			accountNumbers = getAccountNumberAsDigits(lines);
			for (Integer[] accountNumber : accountNumbers) {
				if (isValid(accountNumber)) {
					System.out.println("Valid:" + digitsDetector.findNumber(accountNumber));
				} else {
					System.out.println("InValid:" + digitsDetector.findNumber(accountNumber));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * The lines in the file are converted to corresponding numerals and stored
	 * as a array
	 * 
	 * @param lines
	 * @return
	 * @throws Exception
	 */
	public static ArrayList<Integer[]> getAccountNumberAsDigits(ArrayList<String> lines) throws Exception {
		int totalLines = lines.size();

		ArrayList<Integer[]> accountNumbers = new ArrayList<Integer[]>(10);
		int i = 0;
		for (int k = 0; k < totalLines; k = k + 3) {
			ArrayList<String> numberSets = new ArrayList<String>(lines.subList(k, k + 3));

			StringBuilder[] digits = digitsDetector.getDigits(numberSets);

			Integer[] extractedDigits = new Integer[9];
			try {
				extractedDigits = digitsDetector.extractDigits(digits);
			} catch (Exception e) {
				throw new Exception(e.getMessage() + " at line " + k);
			}
			accountNumbers.add(extractedDigits);

		}
		return accountNumbers;
	}

	/**
	 * 
	 * A valid account number has a valid checksum. This can be calculated as
	 * follows:
	 * 
	 * account number: 3 4 5 8 8 2 8 6 5 position names: d9 d8 d7 d6 d5 d4 d3 d2
	 * d1
	 * 
	 * checksum calculation: (d1+2*d2+3*d3 +..+9*d9) mod 11 = 0 calculates the
	 * checksum for a given number, and identifies if it is a valid account
	 * number.
	 * 
	 * @param accountNumber
	 * @return
	 */
	public static boolean isValid(Integer[] accountNumber) {
		int checksum = 0;
		int i = 9;
		for (int number : accountNumber) {
			checksum = checksum + (number * i);
			i--;
		}
		if (checksum % 11 == 0) {
			return true;
		}
		return false;
	}

}
