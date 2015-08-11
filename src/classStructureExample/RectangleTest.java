package classStructureExample;
import java.util.Scanner;
public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create Scanner
		Scanner in = new Scanner(System.in);
		Rectangle r1 = new Rectangle(); // default rectangle
		
		// get values from user
		System.out.println("HAHA! I've created a default rectangle! Now you create one!");
		System.out.print("X value: ");
		int x1 = in.nextInt();
		System.out.print("Y value: ");
		int y1 = in.nextInt();
		System.out.print("Length: ");
		int l1 = in.nextInt();
		System.out.print("Width: ");
		int w1 = in.nextInt();
		
		Rectangle r2 = new Rectangle(x1, y1, w1, l1); // user defined rectangle
		
		String ans = "y";
		while (ans.equalsIgnoreCase("y")){
			System.out.println("Default X is: " + r1.getX() + " and YOUR X is: " + r2.getX());
			System.out.println("Default Y is: " + r1.getY() + " and YOUR Y is: " + r2.getY());
			System.out.println("Default Length is: " + r1.getLength() + " and YOUR Length is: " + r2.getLength());
			System.out.println("Default Width is: " + r1.getWidth() + " and YOUR Width is: " + r2.getWidth());
			System.out.println("Default Size is: " + r1.size() + " and YOUR Size is: " + r2.size());
			System.out.println("Default Perimeter is: " + r1.perimeter() + " and YOUR Perimeter is: " + r2.perimeter());
			
			in.nextLine(); // clearing Scanner for next input
			System.out.println("Would you like to change your Rectangle? [y/n]");
			ans = in.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.print("X value: ");
				r2.setX(in.nextInt());
				System.out.print("Y value: ");
				r2.setY(in.nextInt());
				System.out.print("Length: ");
				r2.setLength(in.nextInt());
				System.out.print("Width: ");
				r2.setWidth(in.nextInt());
			}
		}
		
		System.out.println("Well that was fun!! TTFN, Ta-Ta for Now!");
		System.out.println("The toString method for r1: " + r1.toString());
		in.close();
	}

}
