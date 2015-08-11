package completedExamples;

import java.util.Scanner;

public class TheLoveOfJava {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/30/2015
	 * @params: User inputs yes or no
	 * Note: http://www.bowdoin.edu/~ltoma/teaching/cs107/spring06/Lectures-Handouts/nestedLoops.html
	 */
	public static void main(String[] args) {
		// Creating scanner to use for input
		Scanner in = new Scanner(System.in);

		// Ask user if they like Java
		String ans = "n";
		int count = 1;
		System.out.print("Do you like Java Programming? [y/n] ");
		ans = in.nextLine();
		
		// if user says yes, display congratulations
		if (ans.equalsIgnoreCase("Y")){
			System.out.println("YAY! So do I!!");
		}
		// begin main loop 
		else if (ans.equalsIgnoreCase("n")) {
			ans="y";
			while (ans.equalsIgnoreCase("y")&&count<=5){
				System.out.print("Are you ");
				// print out the "really's"
				for (int i = 0; i<count; i++){
					System.out.print("really ");
				}
				System.out.print("sure you don't like Java Programming? [y/n] ");
				ans = in.nextLine();
					// terminate after five "really's"
					if (ans.equalsIgnoreCase("y")&&count==5){
						System.out.println("Too bad...");
						break;
					}
				count++;
			}
		} 
		if (ans.equalsIgnoreCase("n")){
			System.out.println("Hope you get to like it soon...");
		}
	}

}
