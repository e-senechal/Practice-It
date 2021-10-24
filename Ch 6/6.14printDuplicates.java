import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * Write a method named printDuplicates that accepts as its parameter a Scanner for an input file 
 * containing a series of lines. Your method should examine each line looking for consecutive 
 * occurrences of the same token on the same line and print each duplicated token along how many 
 * times it appears consecutively. Non-repeated tokens are not printed. Repetition across multiple 
 * lines (such as if a line ends with a given token and the next line starts with the same token) 
 * is not considered in this problem.
 * 
 * Your code prints only the repeated tokens; the ones that only appear once in a row are not shown.
 *  Your code should place a single space between each reported duplicate token and should respect 
 *  the line breaks in the original file. This is why a blank line appears in the expected output, 
 *  corresponding to the fourth line of the file that did not contain any consecutively duplicated 
 *  tokens. You may assume that each line of the file contains at least 1 token of input.
*/

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("duplicates.txt"));
		printDuplicates(file);
		

	}

	public static void printDuplicates(Scanner file) {
		while(file.hasNextLine()) {
			String printThis = "";
			String line = file.nextLine();
			Scanner lineProcessor = new Scanner(line);
			String word = lineProcessor.next();
			while(lineProcessor.hasNext()) {
				int counter = 1;
				String nextWord = lineProcessor.next();
				if(word.equals(nextWord)) {
					while(word.equals(nextWord) && lineProcessor.hasNext()) {
						word = nextWord;
						nextWord = lineProcessor.next();
						counter++;
					}
					if(word.equals(nextWord) && !lineProcessor.hasNext()) {
						counter++;
					}
					printThis += word + "*" + counter + " ";
					counter = 1;
				}
				word = nextWord;
			}
			System.out.println(printThis);
		}


	}
}
