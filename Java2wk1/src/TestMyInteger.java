/*
 * JD Baudean
 * Week 1 discussion test 
 * CMIS242 OL4
 */

public class TestMyInteger {

	public static void main(String[] args) {

			MyInteger integer1 = new MyInteger(5);
			MyInteger integer2 = new MyInteger(10);
			String testString = new String("12345");
			char[] testChars = {'1', '2', '3', '4', '5'};
			
			System.out.println(integer1.getValue());
			System.out.println("isEven " + integer1.isEven());
			System.out.println("isOdd " + integer1.isOdd());
			System.out.println("isPrime " + integer1.isPrime());
			

			
			System.out.println(integer2.getValue());
			System.out.println("isEven " + integer2.isEven());
			System.out.println("isOdd " + integer2.isOdd());
			System.out.println("isPrime " + integer2.isPrime());
			
			System.out.println("Class method 20 isEven " + MyInteger.isEven(20));
			System.out.println("Class method 20 isOdd " + MyInteger.isOdd(20));
			System.out.println("Class method 20 isPrime " + MyInteger.isPrime(20));
			
			System.out.println("integer 2 equals 10 is " + integer2.equals(10));
			System.out.println("integer 2 equals 9 is " + integer2.equals(5));
			
			System.out.println(integer1.getValue() + " equals " + integer2.getValue() + " is " + integer1.equals(integer2));
			
			System.out.println(MyInteger.parseInt(testString));
			System.out.println(MyInteger.parseInt(testChars));
	}

}
