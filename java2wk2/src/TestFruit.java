
public class TestFruit {

	/*
	 *  JD Baudean
	 *  Week 2
	 *  CMIS242 OL4
	 */
	public static void main(String[] args) {

		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		
		System.out.println("***** Hierarchy of fruit object ***** ");
		displayHierarchy(fruit);
		System.out.println("\n");
		System.out.println("***** Hierarchy of orange object ***** ");
		displayHierarchy(orange);
		
		
	}
	
	public static void displayHierarchy(Object object) {
		System.out.println("Is an instance of Fruit: " + (object instanceof Fruit));
		System.out.println("Is an instance of Orange: " + (object instanceof Orange));
		System.out.println("Is an instance of Apple: " + (object instanceof Apple));
		System.out.println("Is an instance of GoldenDelicious: " + (object instanceof GoldenDelicious));
		System.out.println("Is an instance of Macintosh: " + (object instanceof Macintosh));
		
		if (object instanceof Apple) {
			((Apple)object).makeAppleCider();
			
			/* 
			 * object.makeAppleCider();
			 * 
			 * Personal note:
			 * This does not work because object is type Object, 
			 * and makeAppleCider() is not defined for type object.
			 * This is why you have to cast object to type Apple
			 * 
			 */
		}
		
		if (object instanceof Orange) {
			((Orange)object).makeOrangeJuice();
			
			/* 
			 * object.makeOrangeJuice();
			 * 
			 * Personal note:
			 * This does not work because object is type Object, 
			 * and makeOrangeJuice() is not defined for type object.
			 * This is why you have to cast object to type Orange
			 * 
			 */
		}
	}

}
