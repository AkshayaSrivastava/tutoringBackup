package otherWork;
import java.util.*;
public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Put four integers with space in between each:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c= in.nextInt();
		int d = in.nextInt();
		System.out.println("The numbers are: a=" + a + " b=" + b + " c=" + c + " d=" + d);
		System.out.println("a+b =" + (a+b));
		System.out.println("b-c =" + (b-c)); 
		System.out.println("c*d =" + (c*d)); 
		System.out.println("d/a =" + (d/a)); 
		System.out.println("a%b =" + (a%b));
		System.out.println("Math.sqrt(c)" + (Math.sqrt(c))); 
		System.out.println("Math.pow(a,b)" + (Math.pow(a,b))); 
	}

}
