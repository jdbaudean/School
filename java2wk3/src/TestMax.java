/*
 * JD Baudean
 * Week 3 discussion
 * CMIS242 OL 4
 */

public class TestMax {
	public static void main(String[] args) {
		
		String string1 = "November";
		String string2 = "May";
		
		Integer integer1 = 1234;
		Integer integer2 = 1234567;
		
		String largestString = (String)Max.max(string1, string2);
		Integer largestInteger = (Integer)Max.max(integer1, integer2);
		
		System.out.format("The larger string of %s and %s is %s\n", string1, string2, largestString);
		System.out.format("The larger Integer of %d and %d is %d", integer1, integer2, largestInteger);
		
		
	}

}
