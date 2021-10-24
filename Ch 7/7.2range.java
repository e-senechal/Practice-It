/*
 * Write a method named lastIndexOf that accepts an array of integers and an integer value as its 
 * parameters and returns the last index at which the value occurs in the array. The method should 
 * return -1 if the value is not found. For example, in the list containing 
 * {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.
 */

public class Test {
	public static void main(String[] args){
		int[] a1 = {8, 3, 5, 7, 2, 4};
		int range = range(a1);
		System.out.print(range);
	}

	public static int range(int[] array) {
		int min = array[0];
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			min = Math.min(min,array[i]);
			max = Math.max(max, array[i]);
		}
		int range = max - min +1;
		return range;
	}
}
