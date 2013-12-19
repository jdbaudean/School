/*
 * JD Baudean
 * Week 1 Homework 1 Test
 * CMIS242 OL4
 */

public class LinearEquationTest {
	public static void main(String[] args) {
	
		LinearEquation test1 = new LinearEquation(1, 0, 0, 1, 0, 1);
		LinearEquation test2 = new LinearEquation(1, 0, 1, 0, 0, 1);
		LinearEquation test3 = new LinearEquation(9, 4, 3, -5, -6, -21);
		LinearEquation test4 = new LinearEquation(1, 2, 2, 4, 4, 5);
		LinearEquation test5 = new LinearEquation(2, 4, 1, 2, 5, -5);
		LinearEquation test6 = new LinearEquation(2, -5, -1, 3, 2, 1);
		
		//test1
		
		System.out.println("test1 a=" + test1.getA() +
			", b=" + test1.getB() + 
			", c=" + test1.getC() +
			", d=" + test1.getD() + 
			", e=" + test1.getE() +
			", f=" + test1.getF());
		
		if (test1.isSolvable()) 
			System.out.println("test1 x = " + test1.getX() +
					", y = " + test1.getY());
		else 
			System.out.println("The equation has no solution");
		
		//test2
		
		System.out.println("test2 a=" + test2.getA() +
			", b=" + test2.getB() + 
			", c=" + test2.getC() +
			", d=" + test2.getD() + 
			", e=" + test2.getE() +
			", f=" + test2.getF());
		
		if (test2.isSolvable()) 
			System.out.println("test2 x = " + test2.getX() +
					", y = " + test2.getY());
		else 
			System.out.println("The equation has no solution");
		
		//test3
		
		System.out.println("test3 a=" + test3.getA() +
			", b=" + test3.getB() + 
			", c=" + test3.getC() +
			", d=" + test3.getD() + 
			", e=" + test3.getE() +
			", f=" + test3.getF());
		
		if (test3.isSolvable()) 
			System.out.println("test3 x = " + test3.getX() +
					", y = " + test3.getY());
		else 
			System.out.println("The equation has no solution");
		
		//test4
		
		System.out.println("test4 a=" + test4.getA() +
			", b=" + test4.getB() + 
			", c=" + test4.getC() +
			", d=" + test4.getD() + 
			", e=" + test4.getE() +
			", f=" + test4.getF());
		
		if (test4.isSolvable()) 
			System.out.println("test4 x = " + test4.getX() +
					", y = " + test4.getY());
		else 
			System.out.println("The equation has no solution");
		
		//test5
		
		System.out.println("test5 a=" + test5.getA() +
			", b=" + test5.getB() + 
			", c=" + test5.getC() +
			", d=" + test5.getD() + 
			", e=" + test5.getE() +
			", f=" + test5.getF());
		
		if (test5.isSolvable()) 
			System.out.println("test5 x = " + test5.getX() +
					", y = " + test5.getY());
		else 
			System.out.println("The equation has no solution");
		
		//test6
		
		System.out.println("test6 a=" + test6.getA() +
			", b=" + test6.getB() + 
			", c=" + test6.getC() +
			", d=" + test6.getD() + 
			", e=" + test6.getE() +
			", f=" + test6.getF());
		
		if (test6.isSolvable()) 
			System.out.println("test6 x = " + test6.getX() +
					", y = " + test6.getY());
		else 
			System.out.println("The equation has no solution");
		
		
	}
	
}
