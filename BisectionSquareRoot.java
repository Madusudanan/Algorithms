/**
 * A Square root finder algorithm based on Bisection method. Takes the
 * number,decimal precision,number of tries as argument. Accuracy of the result
 * depends upon the value of all the three arguments passed.
 */

public class BisectionSquareRoot {

	public static double FindSquareRoot(double num, double precision, int tries)
			throws IllegalArgumentException {

		double lower_bound = 0;
		int counter = 0;
		double upper_bound = Math.max(num, 1.0);
		double middle = 0;

		if (num < 0 || num == 0) {
			throw new IllegalArgumentException(
					"Square Root cannot be computed for the given value");
		}

		while (Math.abs((middle * middle) - num) > precision && counter < tries) {
			middle = (lower_bound + upper_bound) / 2.0;
			if (middle * middle > num) {
				upper_bound = middle;
			} else {
				lower_bound = middle;
			}
			counter++;

		}
		return middle;

	}

}
