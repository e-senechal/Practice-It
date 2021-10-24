import java.util.Arrays;

/*
 * Write a static method named isSorted that accepts an array of doubles as a parameter and returns 
 * true if the list is in sorted (nondecreasing) order and false otherwise. For example, if arrays 
 * named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} 
 * respectively, the calls isSorted(list1) and isSorted(list2) should return false and true 
 * respectively. Assume the array has at least one element. 
 * A one-element array is considered to be sorted.
 */

public class Test {
	public static void main(String[] args) {
		int[] numbers = { 27, 15, 15, 11, 27 };
		int result = mode(numbers);
		System.out.print(result);

	}

	public static int mode(int[] array) {
		int[] tally = new int[101];
		for (int i = 0; i < array.length; i++) {
			tally[array[i]]++;
		}
		int occurances = 0;
		int index = 0;
		for (int j = 0; j < tally.length; j++) {
			if (tally[j] > occurances) {
				occurances = tally[j];
				index = j;
			}
		}

		return index;
	}
}
