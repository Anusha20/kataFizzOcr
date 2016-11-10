package kata.fizz;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class KataOCRTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public KataOCRTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(KataOCRTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testDigitPatterns() {
		try {
			DigitsDetector d = new DigitsDetector();
			assertEquals(1, d.getNumber("     |  |"));
			assertEquals(9, d.getNumber(" _ |_| _|"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testUC555555555() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add("|_ |_ |_ |_ |_ |_ |_ |_ |_ ");
		lineWithDigits.add(" _| _| _| _| _| _| _| _| _|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[5, 5, 5, 5, 5, 5, 5, 5, 5]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC444444444() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add("                           ");
		lineWithDigits.add("|_||_||_||_||_||_||_||_||_|");
		lineWithDigits.add("  |  |  |  |  |  |  |  |  |");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[4, 4, 4, 4, 4, 4, 4, 4, 4]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC3333333333() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add(" _| _| _| _| _| _| _| _| _|");
		lineWithDigits.add(" _| _| _| _| _| _| _| _| _|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[3, 3, 3, 3, 3, 3, 3, 3, 3]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC222222222() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add(" _| _| _| _| _| _| _| _| _|");
		lineWithDigits.add("|_ |_ |_ |_ |_ |_ |_ |_ |_ ");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC123456789() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add("    _  _     _  _  _  _  _ ");
		lineWithDigits.add("  | _| _||_||_ |_   ||_||_|");
		lineWithDigits.add("  ||_  _|  | _||_|  ||_| _|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC111111111() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add("                           ");
		lineWithDigits.add("  |  |  |  |  |  |  |  |  |");
		lineWithDigits.add("  |  |  |  |  |  |  |  |  |");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[1, 1, 1, 1, 1, 1, 1, 1, 1]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC666666666() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add("|_ |_ |_ |_ |_ |_ |_ |_ |_ ");
		lineWithDigits.add("|_||_||_||_||_||_||_||_||_|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[6, 6, 6, 6, 6, 6, 6, 6, 6]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC777777777() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add("  |  |  |  |  |  |  |  |  |");
		lineWithDigits.add("  |  |  |  |  |  |  |  |  |");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[7, 7, 7, 7, 7, 7, 7, 7, 7]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC888888888() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add("|_||_||_||_||_||_||_||_||_|");
		lineWithDigits.add("|_||_||_||_||_||_||_||_||_|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[8, 8, 8, 8, 8, 8, 8, 8, 8]", acctNo);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testUC999999999() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _  _  _  _  _  _  _  _  _ ");
		lineWithDigits.add("|_||_||_||_||_||_||_||_||_|");
		lineWithDigits.add(" _| _| _| _| _| _| _| _| _|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			assertEquals("[9, 9, 9, 9, 9, 9, 9, 9, 9]", acctNo);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	public void testChecksumValidity() {

		ArrayList<String> lineWithDigits = new ArrayList<String>();
		lineWithDigits.add(" _     _  _  _  _  _  _  _ ");
		lineWithDigits.add(" _||_||_ |_||_| _||_||_ |_ ");
		lineWithDigits.add(" _|  | _||_||_||_ |_||_| _|");

		try {
			String acctNo = getAccountNumberAt(lineWithDigits, 0);
			ArrayList<Integer[]> arr = KataOcr.getAccountNumberAsDigits(lineWithDigits);
			Integer[] accountNumber = arr.get(0);

			String value = KataOcr.digitsDetector.findNumber(accountNumber);
			assertEquals("[3, 4, 5, 8, 8, 2, 8, 6, 5]", acctNo);
			assertEquals(true, KataOcr.isValid(accountNumber));

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	private String getAccountNumberAt(ArrayList<String> lineWithDigits, int index) throws Exception {
		ArrayList<Integer[]> arr = KataOcr.getAccountNumberAsDigits(lineWithDigits);
		Integer[] accountNumber = arr.get(index);

		String acctNo = KataOcr.digitsDetector.findNumber(accountNumber);
		return acctNo;
	}

}
