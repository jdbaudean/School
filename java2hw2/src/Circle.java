/*
 * JD Baudean
 * Week 3 Homework 2
 * CMIS242 OL 4
 */

public class Circle implements Centered {
	
	private double centerX;
	private double centerY;
	private double radius;

	public Circle(double centerX, double centerY, double radius) {
		setCenterX(centerX);
		setCenterY(centerY);
		setRadius(radius);
	}
	
	public Circle() {
		
	}
	
	public void setCenterX(double x) {
		this.centerX = x;
	}
	
	public void setCenterY(double y) {
		this.centerY = y;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public double getCenterX() {
		return this.centerX;
	}

	@Override
	public double getCenterY() {
		return this.centerY;
	}

}
