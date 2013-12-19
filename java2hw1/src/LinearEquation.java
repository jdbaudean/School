/*
 * JD Baudean
 * Week 1 Homework 1
 * CMIS242 OL4
 */

public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	LinearEquation() {
		this(0, 0, 0, 0, 0, 0);
	}
	
	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public double getD() {
		return this.d;
	}
	
	public double getE() {
		return this.e;
	}
	
	public double getF() {
		return this.f;
	}
	
	public boolean isSolvable() {
		if ((this.a * this.d - this.b * this.c) != 0)
			return true;
		return false;
	}
	
	
	public double getX() {
	//calculates x using the formula x = (ed - bf) / (ad - bc)
		return ((this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c));
		
	}
	
	
	public double getY() {
	//calculate x using the formula y = (af - ec) / (ad - bc)
		return ((this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c));
	}
	
}
