package com.glab.algorithms.search;

/**
 * Binary Search Given a sorted array arr[] of n elements, write a function to
 * search a given element x in arr[]. A simple approach is to do linear
 * search.The time complexity of above algorithm is O(n). Another approach to
 * perform the same task is using Binary Search.
 * 
 * Binary Search: Search a sorted array by repeatedly dividing the search
 * interval in half. Begin with an interval covering the whole array. If the
 * value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half. Otherwise narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 * 
 * 
 * @author ganesa-vijayakumar
 *
 */

public class BinarySearch {

	public static void main(String arg[]) {
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };

		// input
		int x = 110;

		// logic
		int index = findIndex(arr, x);

		// output
		printResult(x, index);

		// input
		x = 175;

		// logic
		index = findIndex(arr, x);

		// output
		printResult(x, index);
	}

	/**
	 * Method to find index value for the <code>x</code> element.
	 * 
	 * @param arr
	 *            is a array object which holds list of numbers
	 * @param x
	 *            is the element which for using to find the index
	 * @return exact index value if the element is available in the array otherwise
	 *         -1
	 */
	private static int findIndex(int[] arr, int x) {
		
		int arrLength = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[arrLength/2] == x) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Method to print message based on the <code>index</code> value.
	 * 
	 * @param x
	 *            element value
	 * @param index
	 *            position of the element.
	 */
	private static void printResult(int x, int index) {
		if (index > -1) {
			System.out.println(String.format("Element %d is present at index %d", x, index));
		} else {
			System.out.println(String.format("Element %d is not present in arr[]", x));
		}
	}
}
