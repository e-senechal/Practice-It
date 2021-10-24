/*
 * Write a method named lastIndexOf that accepts an array of integers and an integer value as its 
 * parameters and returns the last index at which the value occurs in the array. The method should 
 * return -1 if the value is not found. For example, in the list containing 
 * {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.
 */

public class Test {
	public static void main(String[] args){
		int[] numbers = { 74, 85, 102, 99, 101, 85, 56 };
		int targetNum = 85;
		int lastLocation = lastIndexOf(numbers, targetNum);
	}

	public static int lastIndexOf(int[] numbers, int target) {
		for(int i = numbers.length-1; i >= 0; i--) {
			if(numbers[i] == target) {
				return i;
			}
		}
		return -1;

	}
}
