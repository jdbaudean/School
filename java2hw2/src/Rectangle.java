/*
 * JD Baudean
 * Week 3 Homework 2
 * CMIS242 OL 4
 */

public class Rectangle implements Centered {
	
	private double pointOneX;
	private double pointTwoX;
	private double pointOneY;
	private double pointTwoY;
	
	public Rectangle(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY) {
		this.setPointOneX(pointOneX);
		this.setPointOneY(pointOneY);
		this.setPointTwoX(pointTwoX);
		this.setPointTwoY(pointTwoY);
	}
	
	public Rectangle() {
	}
	
	public void setPointOneX(double x) {
		this.pointOneX = x;
	}
	
	public void setPointOneY(double y) {
		this.pointOneY = y;
	}
		
	public void setPointTwoX(double x) {
		this.pointTwoX = x;
	}
	
	public void setPointTwoY(double y) {
		this.pointTwoY = y;
	}
	
	public double getPointOneX() {
		return this.pointOneX;
	}
	
	public double getPointOneY() {
		return this.pointOneY;
	}
	
	public double getPointTwoX() {
		return this.pointTwoX;
	}
	
	public double getPointTwoY() {
		return this.pointTwoY;
	}
	
	@Override
	public double getCenterX() {
		return (pointOneX + pointTwoX) / 2;
	}

	@Override
	public double getCenterY() {
		return (pointOneY + pointTwoY) / 2;
	}
	
	

}
