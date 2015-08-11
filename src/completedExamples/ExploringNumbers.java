package completedExamples;

import java.util.*; // Need to import scanner classes for input

public class ExploringNumbers {

	/**
	 * @Author: Akshaya Srivastava
	 * @Date: 07/10/2015
	 * @TODO: Demonstrate different numerical types
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create new scanner object to read stuff in
		Scanner in = new Scanner(System.in);
	
		// Demonstrate difference between int/double/float
		System.out.print("Insert an Integer please:");
		int integer = in.nextInt();
		System.out.println("Your integer was stored as: " + integer);
		
		System.out.print("Insert a Double please:");
		double dub = in.nextDouble();
		System.out.println("Your double was stored as: " + dub);
		
		System.out.print("Insert an Float please:");
		float flo = in.nextFloat();
		System.out.println("Your integer was stored as: " + flo);
		
		// Create dummy variables
		System.out.print("\nInsert four integers with spaces in between please: ");
		final int a = in.nextInt();
		final int b = in.nextInt();
		final int c = in.nextInt();
		final int d = in.nextInt();
		System.out.println("so a = "+ a + ", and b = " + b + 
							", and c = " + c + ", and d = " + d);
		
		// Demonstrate some basic math
		double sum = a+b;
		double diff = b-c;
		double prod = c*d;
		double quo = d/a;
		double rem = a%b;
		double sqrt = Math.sqrt(c);
		double pow = Math.pow(a,b);
		System.out.println("\nWriting 'a+b' in Java yeilds: " + sum);
		System.out.println("Writing 'b-c' in Java yeilds: " + diff);
		System.out.println("Writing 'c*d' in Java yeilds: " + prod);
		System.out.println("Writing 'd/a' in Java yeilds: " + quo);
		System.out.println("Writing 'a%b' in Java yeilds: " + rem);
		System.out.println("Writing 'Math.sqrt(c)' in Java yeilds: " + sqrt);
		System.out.println("Writing 'Math.pow(a,b)' in Java yeilds: " + pow);
	}

}
