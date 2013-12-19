/*
 * JD Baudean
 * Project 3
 * CMIS242 OL 4
 */

public class CharOccurrence {
	
	public static int count(String str, char character) {
		return count(str, character, str.length() -1);
	}
	
	public static int count(String str, char character, int high) {
		
		if (high < 0) 
			return 0;
		else if (str.charAt(high) == character) 
			return 1 + count(str, character, high - 1);
		else 
			return count(str, character, high - 1);
	}
}
