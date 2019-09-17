package com.pradeep.sorting.selectionsort;


/*Algorithm:Selection Sort
 * @author:Pradeep yadav
 * Complexity :n*n
 * in place algo
 * non stable algo
 * Not good for large data
 * 10 values sort in 100 iteration
 * */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = { 20, 35, -15, 7, 55, -22 };

		for (int unsortedIndex = intArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= unsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, unsortedIndex);
		}

		for (int value : intArray) {
			System.out.println(value);
		}

	}

	private static void swap(int[] intArray, int largest, int unsortedIndex) {

		if (largest == unsortedIndex) {
			return;
		}

		int temp = intArray[largest];
		intArray[largest] = intArray[unsortedIndex];
		intArray[unsortedIndex] = temp;
	}

}
