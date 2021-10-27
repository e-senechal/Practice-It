import java.util.Arrays;

/*
 * Write a method called kthLargest that accepts an integer k and an array a as its parameters 
 * and returns the element such that k elements have greater or equal value. If k = 0, return the 
 * largest element; if k = 1, return the second largest element, and so on.
 * 
 * For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the 
 * integer k passed is 2, your method should return 99 because there are two values at least as 
 * large as 99 (101 and 102).
 * 
 * Assume that 0 <= k < a.length. (Hint: Consider sorting the array, or a copy of the array first.)
 */

public class Test {
	public static void main(String[] args) {
		int[] list = {74, 85, 102, 99, 101, 56, 84};
		System.out.print(kthLargestSort(2, list));

	}
	
	// Arrays.sort() answer
	public static int kthLargest(int k, int[] array) {
		k++;
		int index = array.length - k;
		Arrays.sort(array);
		int largest = array[index];
		return largest;
	
	}
	
	//Method sort answer alternative
	public static int kthLargestSort(int k, int[] array) {
		k++;
		int index = array.length - k;
		int temp = 0;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int largest = array[index];
		return largest;
	}

}
