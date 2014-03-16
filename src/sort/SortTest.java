/**
 * 
 */
package sort;

import find.FindArray;

/**
 * @author hp
 *
 */
public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = {49,36,65,29,78,89,23,59};
		/*int[] sortArray = DataSort.insertSort(array);
		
		FindArray find = new FindArray(sortArray);
		int index = find.binarySearch(32, 0, sortArray.length - 1);
		
		System.out.println(index);*/
		//int[] sortArray = DataSort.bubbleSort(array);
		//int[] sortArray = DataSort.quickSort(array, 0, array.length - 1);
		
		int[] sortArray = DataSort.selectionSort(array);
		
		DataSort.printArray(sortArray);
	}
	
}
