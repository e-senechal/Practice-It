import java.util.Arrays;

/*
 * Write a method called stdev that returns the standard deviation of an array of integers. 
 * Standard deviation is computed by taking the square root of the sum of the squares of the 
 * differences between each element and the mean, divided by one less than the number of elements. 
 * (It's just that simple!)
 * 
 * For example, if the array passed contains the values {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}, 
 * your method should return approximately 11.237. You may assume that the array passed is non-null 
 * and contains at least two values, because the standard deviation is undefined otherwise.
 */

public class Test {
	public static void main(String[] args) {
		int[] numbers = { 1, -2, 4, -4, 9, -6, 16, -8, 25, -10 };
		double deviation = stdev(numbers);
		System.out.printf("%.3f", deviation);

	}

	public static double stdev(int[] array) {
		int sum = 0;
		for (int x : array) {
			sum += x;
		}
		double mean = (double) sum / array.length;
		double sumOfSquares = 0;
		for (int i = 0; i < array.length; i++) {
			sumOfSquares += Math.pow(array[i] - mean, 2);
		}
		double stdev = Math.sqrt(sumOfSquares / (array.length - 1));
		return stdev;
	}
}
