import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Write a method named readEntireFile that accepts a Scanner representing an input file as its 
 * parameter, then reads that file and returns the entire text contents of that file as a String.
 */

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("readEverything.txt"));
		String fileContent = readEntireFile(input);
		System.out.print(fileContent);
	}
	static String readEntireFile(Scanner input) {
		String s = "";
		while(input.hasNextLine()) {
			String temp = input.nextLine();
			s += temp + "\n";
		}
		return s;
	}

}
