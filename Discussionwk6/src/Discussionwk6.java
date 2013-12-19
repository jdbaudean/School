
public class Discussionwk6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle defaultRectangle;
		defaultRectangle = new Rectangle();
		
		Rectangle newRectangle;
		newRectangle = new Rectangle(100, 50);

		System.out.println("Default Rectangle is " + defaultRectangle.getArea());
		System.out.println("New Rectangle is " + newRectangle.getArea());
		
	}
}

class Rectangle {
	double length = 10;
	double width = 5;
	
	//Constructors
	Rectangle() {
	}
	
	Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}
	
	//Method
	double getArea() {
		return length * width;
		
	}
}
