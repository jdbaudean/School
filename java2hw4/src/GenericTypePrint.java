/*
 * JD Baudean
 * Review Question 21.7
 * CMIS242 OL 4
 */

public class GenericTypePrint <T> {
	private T genericObject;
	
	public void set(T genericObject) {
		this.genericObject = genericObject;
	}
	
	public void print() {
		System.out.println(this.genericObject);
	}
	
	public static <U> void genericMethodPrint(U genericMethodObject) {
		System.out.println(genericMethodObject);
	}
	
	
	public static void main(String[] args) {
		GenericTypePrint<Double> integer1 = new GenericTypePrint<Double>();
		GenericTypePrint<String> string1 = new GenericTypePrint<String>();
		
		integer1.set(21.7);
		string1.set("Printing a string using a generic class");
		
		integer1.print();
		string1.print();
		
		GenericTypePrint.<String>genericMethodPrint("Printing using a generic type in a method");
		GenericTypePrint.<Double>genericMethodPrint(21.7);
		
	}

}
