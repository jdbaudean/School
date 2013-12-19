/*
 * JD Baudean
 * Homework 4
 * CMIS242 OL 4
 */

public class TestSelectionSort {
	public static void main(String[] args) {
	
	Integer[] integers = {7, 4, 10, 3, 5, 1};
	Double[] doubles = {10.3, 14.2, 7.45, 2.4, 20.5, 4.6};
	Float[] floats = {101.2f, 2.4f, 67.5f, 33.6f, 4.6f};

	System.out.println("Printing pre-sorted integers");
	printList(integers);
	GenericSelectionSort.<Integer>selectionSort(integers);
	System.out.println("Printing sorted integers");
	printList(integers);
	
	System.out.println("Printing pre-sorted doubles");
	printList(doubles);
	GenericSelectionSort.<Double>selectionSort(doubles);
	System.out.println("Printing sorted doubles");
	printList(doubles);
	
	System.out.println("Printing pre-sorted floats");
	printList(floats);
	GenericSelectionSort.<Float>selectionSort(floats);
	System.out.println("Printing sorted floats");
	printList(floats);
	
	}
	
	
	public static <T> void printList(T[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
