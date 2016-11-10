package kata.fizz;

/**
 * prints the numbers from 1 to 100. But for multiples of three print "Fizz"
 * instead of the number and for the multiples of five print "Buzz". For numbers
 * which are multiples of both three and five print "FizzBuzz?".
 * 
 * @author Anusha
 *
 */
public class KataFizzBuzz {

	public static void main(String args[]) {
		printFizzBuzz();
	}

	public static final String fizz = "Fizz";
	public static final String buzz = "Buzz";
	public static final String fizzbuzz = "FizzBuzz";

	/**
	 * 
	 * @param input
	 * @return fizz - if input is divisible by 3 buzz - if the input is
	 *         divisible by 5 and fizzbuzz - if the input is divisible by 3 and
	 *         5
	 */
	public static String getFizzOrBuzz(int input) {
		int MOf3 = input % 3;
		int MOf5 = input % 5;
		if (MOf3 == 0) {
			if (MOf5 == 0) {
				return (fizzbuzz);
			}
			return (fizz);
		}
		if (MOf5 == 0) {
			return (buzz);
		}
		return (input + "");
	}

	public static void printFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getFizzOrBuzz(i));
		}
	}

}
