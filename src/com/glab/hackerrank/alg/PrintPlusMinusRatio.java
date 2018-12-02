package com.glab.hackerrank.alg;

public class PrintPlusMinusRatio {

	public static void main(String[] args) {
		int arr[] = { -4, 3, -9, 0, 4, 1 };
		printPlusMinusRatio(arr);
	}

	// Complete the plusMinus function below.
	static void printPlusMinusRatio(int[] arr) {
		double plusCount = 0.0;
		double minusCount = 0.0;
		double zeroCount = 0.0;
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			double currentItem = arr[i];
			if (currentItem > 0.0) {
				plusCount++;
			} else if (currentItem < 0.0) {
				minusCount++;
			} else {
				zeroCount++;
			}
		}
		System.out.println(
				String.format("%f\n%f\n%f\n", plusCount / arrLength, minusCount / arrLength, zeroCount / arrLength));
	}

}
