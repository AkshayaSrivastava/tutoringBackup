package otherWork;
import java.util.*;
public class StringStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		System.out.println("Put a integer ");
		System.out.println("Put another integer");
		String a = in.nextLine();
		String b = in.nextLine();
		System.out.print(a+b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		String e = "" + (c+d);
		
	}

}
