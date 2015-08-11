package completedExamples;

// importing scanner package to use for input
import java.util.*;

public class AcceptingInput {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/05/2015
	 * @TODO: Demonstrate accepting inputs
	 * @params: User inputs String
	 */
	public static void main(String[] args) {
		
		// Create new scanner object to read stuff in
		Scanner in = new Scanner(System.in);
		
		// Prompt user for some sort of input
		System.out.print("Enter your name: ");
		
		// Save user input into a parameter
		String name = in.nextLine();
		
		// Output the user input
		System.out.print("Oh, so your name is " + name + ". Got it!");
	}

}
