package completedExamples;

import java.util.Random;
import java.util.Scanner;

public class HarderGuessingGame {

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
		System.out.println("I've picked a number between 0 and 100. Try to guess what it is! You only have 5 guesses though!!");
		
		// Set up loops to keep going until user figures out the number
		int guess = 200;
		for (int i = 0; i < 5; i++){
			// Get Integer from User
			System.out.print("Please enter an Integer: ");
			guess = in.nextInt();
			if (guess > target) { // if guess is greater than the target ... 
				System.out.println("Nope! You guessed too high! Guess again!"); // let the user know!
			} else if (guess < target) { // if guess is less than the target ... 
				System.out.println("Nope! You guessed too low! Guess again!"); // let the user know!
			} else { // only other scenario is that the guess matches the target ... 
				break; // so get out of the loop, dummy!!
			}
		}
		
		if (guess == target) {
			// if the code gets to this step...they've obviously got it!
			System.out.println("Yay! You got it!! The answer was: " + target + "!\nBet it won't be so easy next time...");
		} else {
			// looks like they couldn't guess it in time.
			System.out.println("Sorry, but you couldn't guess it! The answer was: " + target + "!\nTry again next time!!");
		}
	}


}
