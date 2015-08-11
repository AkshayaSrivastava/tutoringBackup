package completedExamples;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/11/2015
	 * @params: User keeps inputting integers until they get the correct one.
	 */
	public static void main(String[] args) {
		// Create new scanner object to read stuff in
		Scanner in = new Scanner(System.in);
		
		// Create new randomizer to generate a goal to guess.
		Random rand = new Random();
		
		// Initialize Game
		int target = rand.nextInt(101);
		System.out.println("I've picked a number between 0 and 100. Try to guess what it is!");
		
		// Set up loops to keep going until user figures out the number
		int guess = 200;
		while (guess != target){
			// Get Integer from User
			System.out.print("Please enter an Integer: ");
			guess = in.nextInt();
			if (guess > target){ // if guess is greater than the target 
				System.out.println("Nope! You guessed too high! Guess again!"); // let the user know!
			} else if (guess < target){ // if guess is less than the target
				System.out.println("Nope! You guessed too low! Guess again!"); // let the user know!
			}
		}
		
		// if the code gets to this step...they've obviously got it!
		System.out.println("Yay! You got it!! The answer was: " + target + "!\nBet it won't be so easy next time...");
	}

}
