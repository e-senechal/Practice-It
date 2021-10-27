import java.util.Arrays;

/*
 * Write a method called median that accepts an array of integers as its argument and returns the 
 * median of the numbers in the array. The median is the number that will appear in the middle if 
 * you arrange the elements in order. Assume that the array is of odd size (so that one sole element 
 * constitutes the median) and that the numbers in the array are between 0 and 99 inclusive
 *
 *For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5, 
 *and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.
 */

public class Test {
	public static void main(String[] args) {
		int[] list = { 42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27 };
		int median = median(list);
		System.out.print(median);

	}

	// Self sorting method answer
	public static int median(int[] array) {
		int temp = 0;
		int smallest = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int median = array[array.length / 2];
		return median;

	}

	// Arrays.sort() method answer
	public static int medianAlternate(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}

}
