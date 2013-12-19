/*
 * JD Baudean
 * Week 3 Homework 2
 * CMIS242 OL 4
 */

public class TestCentered {
	
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(10, 7, 5, 15);
		Rectangle rectangle2 = new Rectangle(-7, 4, -12, 10);
		Circle circle1 = new Circle(5, 2, 10);
		Circle circle2 = new Circle(-2, 4, 6);
		
		System.out.println("The center of rectangle 1 is " + rectangle1.getCenterX() + ", " +
				rectangle1.getCenterY());
		System.out.println("The center of rectangle 2 is " + rectangle2.getCenterX() + ", " +
				rectangle2.getCenterY());
		
		System.out.println("The center of circle 1 is " + circle1.getCenterX() + ", " +
				circle1.getCenterY() + " and the radius is " + circle1.getRadius());
		System.out.println("The center of circle 2 is " + circle2.getCenterX() + ", " +
				circle2.getCenterY() + " and the radius is " + circle2.getRadius());
		
		
	}
}
