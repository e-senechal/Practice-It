import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/* Write a method named doubleSpace that accepts a Scanner for an input file and a PrintStream 
 * for an output file as its parameters, writing into the output file a double-spaced version of 
 * the text in the input file. You can achieve this task by inserting a blank line between 
 * each line of output.
 */

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("lines.txt"));
		PrintStream output = new PrintStream(new File("alteredText.txt"));
		doubleSpace(input, output);
	}

	public static void doubleSpace(Scanner input, PrintStream output) {
		while(input.hasNextLine()) {
			String currentLine = input.nextLine();
			output.println(currentLine + "\n");
		}
	}

}
