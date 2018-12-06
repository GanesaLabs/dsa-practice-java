package com.glab.algorithms.search;

/**
 * Linear Search Problem: Given an array arr[] of n elements, write a function
 * to search a given element x in arr[].
 * 
 * Examples :
 * 
 * Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170} x = 110;
 * 
 * Output : 6 Element x is present at index 6
 * 
 * Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170} x = 175; Output
 * : -1 Element x is not present in arr[].
 * 
 * @author ganesa-vijayakumar
 *
 */

public class LinearSearch {

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
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
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
