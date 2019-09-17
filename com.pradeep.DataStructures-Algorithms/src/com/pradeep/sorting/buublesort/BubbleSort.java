package com.pradeep.sorting.buublesort;

/*Algorithm:Buuble Sort
 * @author:Pradeep yadav
 * Complexity :n*n
 * in place algo
 * stable algo
 * Not good for large data
 * 10 values sort in 100 iteration
 * */
public class BubbleSort {

	public static void main(String[] args) {

		int intArray[] = { 20, 35, -15, 7, 55, -22 };

		for (int unsortedindex = intArray.length - 1; unsortedindex > 0; unsortedindex--) {
			for (int i = 0; i < unsortedindex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}

		// print after sorting

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	public static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
