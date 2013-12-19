/*
 * JD Baudean
 * Project 3
 * CMIS242 OL 4
 */

public class CharOccurrenceTest {
	
	public static void main(String[] args) {
	
	// This should return 1
	System.out.println("The letter l occurrs " + CharOccurrence.count("Baltimore", 'l') + " times in the word Baltimore");
	
	// This should return 4
	System.out.println("The letter s occurrs " + CharOccurrence.count("Mississippi", 's') + " times in the word Mississipi");
	
	// This should return 2
	System.out.println("The letter a occurrs " + CharOccurrence.count("Capitals", 'a') + " times in the word Capitals");
	
	// Testing the first and last letter of a word, should return 2 occurrences
	System.out.println("The letter t occurrs " + CharOccurrence.count("test", 't') + " times in the word test");
	
	
	// This should return 0 occurrences of the letter x
	System.out.println("The letter x occurrs " + CharOccurrence.count("Ravens", 'x') + " times in the word Ravens");
	
	// This should only return 1 occurrence of the letter o because the method is case sensitive
	System.out.println("The letter o occurrs " + CharOccurrence.count("Orioles", 'o') + " times in the word Orioles");
	
	}

}
