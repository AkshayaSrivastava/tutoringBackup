package otherWork;
import java.util.*;
public class StringExampleTheSequel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = in.nextLine();
		System.out.println("Your name is " + name);
		System.out.println("Your nick name is " + name.substring(0,3));
	}

}