package completedExamples;

import java.util.Scanner; // Need to import scanner classes for input

public class ExploringStrings {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/10/2015
	 * @TODO: Demonstrate Strings
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create new scanner object to read stuff in
		Scanner in = new Scanner(System.in);
		
		// Create demo string to operate on and dummy variables
		System.out.print("Please input two different integers for a and b by pressing enter after the first number, " +
				"which is smaller than the second number: ");
		String a = in.nextLine();
		String b = in.nextLine();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		double e = c/d;
		System.out.print("Please Write a sentence that has more characters than your second number " +
				"to be stored in the variable 'demo' : ");
		String demo = in.nextLine();
		
		// Show string operations
		System.out.println("\n\nWriting 'demo.length()' in Java yeilds: " + demo.length());
		System.out.println("\nYou can turn strings that contain integers into intergers too! \nlook! " +
				"Typing 'int c = Integer.parseInt(a);' yeilds: " + c + 
				" and writing 'int d = Integer.parseInt(b);' yeilds: " + d + ". You can do something similar with Doubles, etc.");
		System.out.println("\nWriting 'demo.substring(c,d)' in Java yeilds: " + demo.substring(c,d));
		System.out.println("\nYou can also have the system convert your numbers back into Strings. Let's create a double with" +
				"'double e = c/d;' and add it to the substring with the concatenate symbol (+). Type in " +
				"'demo.substring(c,d)+e' and see what happens!");
		System.out.println("\nAnother consideration is using the substring command with only one parameter. Try putting in " +
				"'demo.substring(c)' into your code. What do you think will happen? Will it work??");
	}

}
