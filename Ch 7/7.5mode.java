import java.util.Arrays;

/*
* Write a method called mode that returns the most frequently occurring element of an 
* array of integers. Assume that the array has at least one element and that every element 
* in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower 
* value. 
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
