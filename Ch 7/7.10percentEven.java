import java.util.Arrays;

/*
 * Write a method called percentEven that accepts an array of integers as a parameter and returns 
 * the percentage of even numbers in the array as a real number. For example, if the array stores 
 * the elements {6, 2, 9, 11, 3}, then your method should return 40.0. If the array contains no even 
 * elements or no elements at all, return 0.0.
 */

public class Test {
	public static void main(String[] args) {
		int[] list = { 6, 2, 9, 11, 3 };
		double x = percentEven(list);
		System.out.print(x);

	}

	public static double percentEven(int[] array) {
		double evenTotal = 0.0;
		if(array.length == 0) {
			return evenTotal;
		}
		for (int x : array) {
			if (x % 2 == 0) {
				evenTotal++;
			}
		}
		double evenPercent = (evenTotal / array.length) * 100;
		return evenPercent;
	}
}
