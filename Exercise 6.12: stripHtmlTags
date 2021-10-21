import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*
* Write a method called stripHtmlTags that accepts a Scanner representing 
* an input file containing an HTML web page as its parameter, then reads
* that file and prints the file's text with all HTML tags removed. A tag 
* is any text between the characters < and > . For example, consider the 
* following text: 
* <html>
* <head>
* <title>My web page</title>
* </head>
* <body>
* <p>There are many pictures of my cat here,
* as well as my <b>very cool</b> blog page,
* stuff about my trip to Vegas.</p>
* 
* Here's my cat now:<img src="cat.jpg">
* </body>
* </html>
* 
* If the file contained these lines, your program should output the following text:
* 
* My web page
* 
* 
* There are many pictures of my cat here,
* as well as my very cool blog page,
* which contains awesome
* stuff about my trip to Vegas.
* 
* Here's my cat now:
* 
* You may assume that the file is a well-formed HTML document and that there
* are no < or > characters inside tags. 
*/

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("html.txt"));
		stripHtmlTags(file);
		

	}

	public static void stripHtmlTags(Scanner file) {
		while(file.hasNextLine()) {
			String oneLine = file.nextLine();
			while(oneLine.contains("<") || oneLine.contains(">")) {
				int location1 = oneLine.indexOf("<");
				int location2 = oneLine.indexOf(">");
				if(location1 == 0) {
					oneLine = oneLine.substring(location2 +1);
				}
				else {
					oneLine = oneLine.substring(0, location1) + oneLine.substring(location2+1);
				}
			}
			System.out.println(oneLine);
			
		}
		

	}
}
