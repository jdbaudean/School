/*
 * JD Baudean
 * Week 1 Discussion
 * CMIS242 OL4
 */

public class MyInteger {

	private int value;
	
	MyInteger(int value) {
		this.value = value;
	}
	
	MyInteger() {
		this(0);
	}
	
	public int getValue() {
		return this.value;
	}
	
	// Instance Methods
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	// Class Methods
	
	public static boolean isEven(int value) {
		if (value % 2 == 0) 
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value) {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int value) {
		for (int count = 2; count < value; count++) {
			if (value % count == 0)
				return false;
		}
		return true;
	}
		
	public static boolean isEven(MyInteger value) {
		return value.isEven(); 
	}
	
	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	
	public boolean equals(int value) {
		if (this.value ==  value)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger value) {
		return value.equals(this.value);
	}

	public static int parseInt(char[] numbers) {
		int number = Integer.parseInt(new String(numbers));
		return number;
	}
	
	public static int parseInt(String numbers) {
		int number = Integer.parseInt(numbers);
		return number;
	}

}
