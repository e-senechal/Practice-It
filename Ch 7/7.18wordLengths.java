
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Write a method called wordLengths that accepts a Scanner representing an input file as its 
 * argument. Your method should read from the given file, count the number of letters in each 
 * token in the file, and output a result diagram of how many words contain each number of letters. 
 * Use tabs before the asterisks so that they'll line up. If there are no words of a given length, 
 * omit that line from the output.
 */

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("wordLength.txt"));
		wordLengths(input);

	}

	public static void wordLengths(Scanner input) {
		int[] array = new int[81];

		while (input.hasNext()) {
			array[input.next().length()]++;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.printf("%d: %d\t", i, array[i]);
				for (int j = 0; j <= array[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}
}
