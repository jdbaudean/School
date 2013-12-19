import java.util.Stack;

/*
 * JD Baudean
 * Week 8 Discussion Review Question 22.25
 * CMIS242 OL 4
 */

public class StackExample {

	public static void main(String[] args) {
		
		// Create an instance of a stack
		Stack<String> stack1 = new Stack<String>();
		
		String string1 = "first element";
		String string2 = "second element";
		
		// Adding new elements to a stack
		System.out.println("Adding elements to the stack");
		stack1.push(string1);
		stack1.push(string2);
		
		System.out.println(stack1);
		
		// Get size of stack
		System.out.println("The stack has " + stack1.size() + " elements");
		
		// Remove an element from a stack
		System.out.println("Removing element " + stack1.pop() + " from the stack");
		

	}

}
