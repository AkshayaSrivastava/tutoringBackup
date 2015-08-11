package otherWork;
import java.util.*;
public class IshanEasyGuessGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome. This game is called The Easy Guessing Game.");
		System.out.println("In this game you have to guess the number I have chosen from 0 to 100.");
		Random rand = new Random();
		int a = rand.nextInt(101);
		System.out.println(a);
		int b=200;
		while (b != a)	{
			b = in.nextInt();
			if ( b < a ) {
				System.out.println("It is too low. Guess again!");
			}
			if ( b > a ){
				System.out.print("It is too low. Guess again!");
			}
		}
		System.out.println("Great Job!");
	}
}
