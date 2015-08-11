package classStructureExample;

public class Square extends Rectangle {
	// This class is extending rectangle, so it already has methods for size and perimeter along
	// with the associated setters and getters (mutators and accessors)
	
	// create constructor methods
	public Square(){ // no parameters
		setX(0);
		setY(0);
		setLength(1);
		setWidth(1);
	}
	
	public Square(int a, int b){ // unit square at specific location
		setX(a);
		setY(b);
		setLength(1);
		setWidth(1);
	}
	
	public Square(int s){ // square of certain size at origin
		setX(0);
		setY(0);
		setLength(s);
		setWidth(s);
	}
	
	public Square (int a, int b, int s){ // square of certain size at specific location
		setX(a);
		setY(b);
		setLength(s);
		setWidth(s);
	}
	
	// create methods unique to Square
	public double getDiagonal(){
		double diagonal = Math.sqrt(2*Math.pow(getLength(),2));
		return diagonal;
	}
	
	public double originDistance(){
		double distance = Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2));
		return distance;
	}
}
