package completedExamples;

import java.util.Scanner;

public class CompletedHomeworkAssigned_07_11_2015 {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/11/2015
	 * @TODO: Demonstrate Completed Homework 
	 * 		  1) integer + double (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  2) integer - double (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  3) integer * double (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *	  	  4) integer / double (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  5) integer % double (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  6) double / integer (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  7) double % integer (do you expect an integer answer or a double? Why do you think you got what you got? If you get an error, why do you think it failed? if it does fail, comment out the code to continue)
	 *		  8) Parse the numerical string input into an integer and subtract it from the length of the text string input
	 *		  9) Create a substring of the text string input with the number from step 8 to the end. 
	 * @params: User inputs 2 Strings, 1 double, and 1 integer
	 */
	public static void main(String[] args) {
		
		// Create new scanner object to read stuff in
		Scanner in = new Scanner(System.in);
		
		// Get Integer from User
		System.out.print("Please enter an Integer: ");
		int integer = in.nextInt();
		
		// Get Double from User
		System.out.print("Please enter a Double/Decimal number: ");
		double dub = in.nextDouble();
		
		// Display Numerical manipulations
		// Note: everything runs. No errors.
		System.out.println("Your Integer + Your Double = " + (integer+dub));
		System.out.println("Your Integer - Your Double = " + (integer-dub));
		System.out.println("Your Integer * Your Double = " + (integer*dub));
		System.out.println("Your Integer / Your Double = " + (integer/dub));
		System.out.println("Your Integer % Your Double = " + (integer%dub));
		System.out.println("Your Double / Your Integer = " + (dub/integer));
		System.out.println("Your Double % Your Integer = " + (dub%integer));
		
		// Get Strings from User
		in.nextLine(); // Just clear out anything remaining in the scanner, so that it starts out fresh.
		System.out.println("Please enter a sentence: ");
		String sent = in.nextLine();
		System.out.println("Please enter another integer that is smaller than the length of your sentence: ");
		String num = in.nextLine();
		System.out.println("The length of your sentence is: " + sent.length());
		int parse = Integer.parseInt(num);
		System.out.println("The length of your sentence minus your inputted number is: " + (sent.length()-parse));
		System.out.println("This means that the last " + parse + " characters of your sentence are: " +
				sent.substring(sent.length()-parse));

	}

}
