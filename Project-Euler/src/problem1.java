/**
 * Multiples of 3 and 5 Project Euler.net: Problem 1
 * 
 * @author Demetruis Vassar
 *
 */
public class problem1 {

	public static void main(String[] args) {
		int multiple1 = 3;
		int multiple2 = 5;
		int limit = 1000;
		int sum = trackAndSumMultiples(multiple1, multiple2, limit);
		System.out
				.printf("The sum of all multiples of %d and %d leading up to %d is %d.",
						multiple1, multiple2, limit, sum);
	}

	/**
	 * Takes any two multiples before the limit and returns the sum.
	 * 
	 * @param x
	 * @param y
	 * @param limit
	 * @return sum;
	 */

	private static int trackAndSumMultiples(int x, int y, int limit) {
		int sum = 0;
		for (int i = 0; i < limit; i++) {
			// If i is a multiple of x or y, add it to the sum.
			if ((i % x == 0) || (i % y == 0)) {
				sum += i;
			}
		}
		return sum;
	}

}
