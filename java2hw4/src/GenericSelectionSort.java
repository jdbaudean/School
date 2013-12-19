/*
 * JD Baudean
 * Homework 4
 * CMIS242 OL 4
 */


public class GenericSelectionSort {
	
	public static <E extends Comparable <E>> void selectionSort(E[] list){
		for (int indexPosition = 0; indexPosition < list.length -1; indexPosition++) {
			
			E currentMin = list[indexPosition];
			int currentMinIndex = indexPosition;
			
			for (int element = indexPosition + 1; element < list.length; element++) {
				if (list[element].compareTo(currentMin) < 0) {
					currentMin = list[element];
					currentMinIndex = element;
				}
			}
			list[currentMinIndex] = list[indexPosition];
			list[indexPosition] = currentMin;
		}
		
	}

}
