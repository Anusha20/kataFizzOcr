package kata.fizz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DigitsDetector {
	private static final String emptyPattern = "   ";
	private static final String sus = " _ ";
	private static final String ssp = "  |";
	private static final String sup = " _|";
	private static final String pup = "|_|";
	private static final String pus = "|_ ";
	private static final String psp = "| |";

	private static final String one = emptyPattern + ssp + ssp;
	private static final String two = sus + sup + pus;
	private static final String three = sus + sup + sup;
	private static final String four = emptyPattern + pup + ssp;
	private static final String five = sus + pus + sup;
	private static final String six = sus + pus + pup;
	private static final String seven = sus + ssp + ssp;
	private static final String eight = sus + pup + pup;
	private static final String nine = sus + pup + sup;
	private static final String zero = sus + psp + pup;

	private static final HashMap<String, Integer> numbers = new HashMap<String, Integer>();

	public DigitsDetector() {
		initialize();
	}

	public static void initialize() {
		numbers.put(one, 1);
		numbers.put(two, 2);
		numbers.put(three, 3);

		numbers.put(four, 4);
		numbers.put(five, 5);
		numbers.put(six, 6);
		numbers.put(seven, 7);
		numbers.put(eight, 8);
		numbers.put(nine, 9);
		numbers.put(zero, 0);

	}

	public  int getNumber(String number) throws Exception {
		if (numbers.containsKey(number)) {
			return numbers.get(number);
		}
		throw new Exception("invalid number format");
	}

	public  StringBuilder[] getDigits(List<String> lineWithDigits) {
		StringBuilder[] digits = new StringBuilder[9];
		for (String line : lineWithDigits) {
			int digitInd = 0;
			for (int j = 0; j < line.length(); j = j + 3) {
				String temp = "";
				if (j + 3 > line.length()) {
					temp = line.substring(j, line.length());
				} else {
					temp = line.substring(j, j + 3);
				}
				if (digitInd < digits.length) {
					if (digits[digitInd] == null) {
						digits[digitInd] = new StringBuilder();
					}
					digits[digitInd] = digits[digitInd].append(temp);
					digitInd++;
				}
			}

		}
		return digits;
	}

	public String findNumber(Integer[] accountNumber){
		 return Arrays.toString(accountNumber);
	}
	public  Integer[] extractDigits(StringBuilder[] digits) throws Exception {
		
		Integer[] numbers = new Integer[digits.length];
		int i = 0;
		for (StringBuilder numb : digits) {
			int number = getNumber(numb.toString());
			numbers[i++] = number;
		}
		return numbers;
	}
}
