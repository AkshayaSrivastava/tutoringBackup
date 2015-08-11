package classStructureExample;

public class Rectangle {

	// local variables
	int x;
	int y;
	int w;
	int l;
	
	// methods
	// constructor 1 - default
	public Rectangle(){
		x = 0;
		y = 0;
		w = 1;
		l = 2;
	}
	
	// constructor 2 - user made
	public Rectangle(int a, int b, int c, int d){
		x = a;
		y = b;
		w = c;
		l = d;
	}
	
	// getters / accessors
	public int getX(){ // get x
		return x;
	}
	
	public int getY(){ // get y
		return y;
	}
	
	public int getLength(){ // get length
		return l;
	}
	
	public int getWidth(){ // get width
		return w;
	}
	
	// setters / mutators
	public void setX(int a){ // set x
		x = a;
	}
	
	public void setY(int a){ // set y
		y = a;
	}
	
	public void setLength(int a){ // set length
		l = a;
	}
	
	public void setWidth(int a){ // set width
		w = a;
	}
	
	// other methods
	public int size(){
		int size = l * w;
		return size;
	}
	
	public int perimeter(){
		int perimeter = 2*l + 2*w;
		return perimeter;
	}
}
