import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Write a method called wordWrap that accepts a Scanner representing an input file as its 
 * parameter and outputs each line of the file to the console, word-wrapping all lines that are 
 * longer than 60 characters. For example, if a line contains 112 characters, the method should 
 * replace it with two lines: one containing the first 60 characters and another containing the 
 * final 52 characters. A line containing 217 characters should be wrapped into four lines: 
 * three of length 60 and a final line of length 37.
 */

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("words.txt"));
		wordWrap(input);
	}

	public static void wordWrap(Scanner input) {
		while (input.hasNextLine()) {
			String str = input.nextLine();
			int stringLength = str.length();
			int start = 0;
			int end = 60;
			while (stringLength > 60) {
				System.out.println(str.substring(start, end));
				start += 60;
				end += 60;
				stringLength -= 60;
			}
			System.out.println(str.substring(start, str.length()));
		}

	}

}
