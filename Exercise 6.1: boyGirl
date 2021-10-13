import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a method named boyGirl that accepts a Scanner as a parameter. 
 * The Scanner is reading its input from a file containing a series of names followed by integers.
 * The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of 
 * the boys' integers and the sum of the girls' integers. The input could end with either a boy or 
 * girl; you may not assume that it contains an even number of names. 
 * If the input file tas.txt contains the following text:
 * 
 * Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6 
 * 
 * then your method could be called in the following way:
 * 
 * Scanner input = new Scanner(new File("tas.txt"));
 * boyGirl(input);
 * and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:
 *
 * 4 boys, 3 girls
 * Difference between boys' and girls' sums: 2*/

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("tas.txt"));
		boyGirl(input);
	}

	public static void boyGirl(Scanner input) {
		int girlTotal = 0;
		int boyTotal = 0;
		int girlSum = 0;
		int boySum = 0;
		while(input.hasNext()) {
			input.next();
			boySum += input.nextInt();
			boyTotal++;
			if(input.hasNext()) {
				input.next();
				girlSum += input.nextInt();
				girlTotal++;
			}
		}
		int absSum = Math.abs(boySum - girlSum);
		System.out.println(boyTotal + " boys, " + girlTotal + " girls");
		System.out.print("Difference between boys' and girls' sums: " + absSum);
	} 
}
