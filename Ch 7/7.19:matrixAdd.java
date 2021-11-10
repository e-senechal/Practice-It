
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as 
 * parameters, treats the arrays as 2D matrices and adds them, returning the result. The sum of 
 * two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. You may 
 * assume that the arrays passed as parameters have the same dimensions.
 */

//full program included for testing
public class Test {
	public static void main(String[] args) {
		int[][] arrayA = new int[3][];
		int[][] arrayB = new int[3][];
		for (int x = 0; x < arrayA.length; x++) {
			arrayA[x] = new int[] { x + 1, x + 2 };
			arrayB[x] = new int[] { x, x + 1 };

		}
		System.out.print(Arrays.deepToString(matrixAdd(arrayA, arrayB)));
	}
  
  //actual solution
	public static int[][] matrixAdd(int[][] listA, int[][] listB) {
		int lengthA = listA.length;
		int lengthB = listB.length;
		if (lengthA == 0 || lengthB == 0) {
			return new int[0][0];
		}
		int[][] listC = new int[listA.length][listA[0].length];
		for (int i = 0; i < listA.length; i++) {
			for (int j = 0; j < listA[i].length; j++) {
				listC[i][j] = listA[i][j] + listB[i][j];
			}
		}

		return listC;
	}

}
