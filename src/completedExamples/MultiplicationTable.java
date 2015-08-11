package completedExamples;

import java.util.Scanner;

public class MultiplicationTable {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/30/2015
	 * @params: User inputs an integer and receives a square matrix of multiples
	 * Note: http://www.bowdoin.edu/~ltoma/teaching/cs107/spring06/Lectures-Handouts/nestedLoops.html
	 */
	public static void main(String[] args) {
		// creating scanner for input
		Scanner in = new Scanner(System.in);
		
		// ask user for table dimension
		System.out.print("Dear User, Please enter a number, nd I will compute a multiplication table for you: ");
		int input = in.nextInt();
		
		// give the user confirmation of selection
		System.out.println("You typed in " + input + ". Here is the multiplication table");
		
		// create loops to print out table
		for (int c = 1; c <= input; c++){
			for (int r = 1; r <= input; r++){
				if (String.valueOf(r*c).length() == 1){
					System.out.print(" " + r*c + " ");
				} else {
					System.out.print(r*c + " ");
				}
			}
			System.out.println();
		}
		
		// Ask ending questions
		in.nextLine(); // clearing out scanner
		System.out.print("Happy? (y/n)");
		String answer = in.nextLine();
		if (answer.equalsIgnoreCase("y")){
			System.out.println("Great! Now you can try the next problem :)");
		} else if (answer.equalsIgnoreCase("n")){
			System.out.println("Try again...");
		} else {
			System.out.println("GOSH! You had one job, bambi! Go try again!!");
		}
	}

}
