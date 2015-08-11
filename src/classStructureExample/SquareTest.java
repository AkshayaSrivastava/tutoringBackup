package classStructureExample;

import java.util.Scanner;

public class SquareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create Scanner
				Scanner in = new Scanner(System.in);
				Square s1 = new Square(); // default square
				
				// get values from user
				System.out.println("HAHA! I've created a default square! Now you create 3!");
				System.out.print("X value: ");
				int x1 = in.nextInt();
				System.out.print("Y value: ");
				int y1 = in.nextInt();
				System.out.print("Length: ");
				int l1 = in.nextInt();
								
				Square s2 = new Square(x1, y1); // unit square at x1, y1
				Square s3 = new Square(l1); // square of side length l1 at origin
				Square s4 = new Square(x1, y1, l1); // fully user defined square
				
				String ans = "y";
				while (ans.equalsIgnoreCase("y")){
					System.out.println("Default X is: " + s1.getX() + " and YOUR X1 is: " + s2.getX() + " and YOUR X2 is: " + s3.getX() + " and YOUR X3 is: " + s4.getX());
					System.out.println("Default Y is: " + s1.getY() + " and YOUR Y1 is: " + s2.getY() + " and YOUR Y2 is: " + s3.getY() + " and YOUR Y3 is: " + s4.getY());
					System.out.println("Default Length is: " + s1.getLength() + " and YOUR Side1 is: " + s2.getLength() + " and YOUR Side2 is: " + s3.getLength() + " and YOUR Side3 is: " + s4.getLength());
					System.out.println("Default Size is: " + s1.size() + " and YOUR Size1 is: " + s2.size() + " and YOUR Size2 is: " + s3.size() + " and YOUR Size3 is: " + s4.size());
					System.out.println("Default Perimeter is: " + s1.perimeter() + " and YOUR Perimeter1 is: " + s2.perimeter() + " and YOUR Perimeter2 is: " + s3.perimeter() + " and YOUR Perimeter3 is: " + s4.perimeter());
					System.out.println("Default Diagonal is: " + s1.getDiagonal() + " and YOUR Diagonal1 is: " + s2.getDiagonal() + " and YOUR Diagonal2 is: " + s3.getDiagonal() + " and YOUR Diagonal3 is: " + s4.getDiagonal());
					System.out.println("Default Origin_Distance is: " + s1.originDistance() + " and YOUR Origin_Distance1 is: " + s2.originDistance() + " and YOUR Origin_Distance2 is: " + s3.originDistance() + " and YOUR Origin_Distance3 is: " + s4.originDistance());
					
					in.nextLine(); // clearing Scanner for next input
					System.out.println("Would you like to change your Squares? [y/n]");
					ans = in.nextLine();
					if (ans.equalsIgnoreCase("y")){
						System.out.print("X value: ");
						int new_x = in.nextInt();
						s2.setX(new_x);
						s4.setX(new_x);
						System.out.print("Y value: ");
						int new_y = in.nextInt();
						s2.setY(new_y);
						s4.setY(new_y);
						System.out.print("Length: ");
						int new_l = in.nextInt();
						s3.setLength(new_l);
						s4.setLength(new_l);
						s3.setWidth(new_l);
						s4.setWidth(new_l);
					}
				}
				
				System.out.println("Well that was fun!! TTFN, Ta-Ta for Now!");
				in.close();

	}

}
