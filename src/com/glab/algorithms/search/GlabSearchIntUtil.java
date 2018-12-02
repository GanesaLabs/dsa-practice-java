package com.glab.algorithms.search;

/**
 * Search search util
 * 
 * @author ganesa-vijayakumar
 *
 */

public class GlabSearchIntUtil {

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
	public static int linearSearch(int[] arr, int x) {
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
	public static void printResult(int x, int index) {
		if (index > -1) {
			System.out.println(String.format("Element %d is present at index %d", x, index));
		} else {
			System.out.println(String.format("Element %d is not present in arr[]", x));
		}
	}

}
