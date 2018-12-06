package com.glab.hackerrank.alg;

public class PrintBinaryNumberMaxConsequentOnes {

	public static void main(String[] args) {
		printBinaryNumberMaxConsequentOnes(5);
	}

	public static void printBinaryNumberMaxConsequentOnes(int n) {
		char[] arr = Integer.toBinaryString(n).toCharArray();
		int index = 0;
		int maxNumber = 0;
		for (Character c : arr) {
			if (c.equals('1')) {
				index++;
				if (maxNumber < index) {
					maxNumber = index;
				}
			} else {
				index = 0;
			}
		}
		System.out.println(maxNumber);
	}

	public static void printBinaryNumbers(int n) {
		char[] arr = Integer.toBinaryString(n).toCharArray();
		StringBuilder sb = new StringBuilder();
		for (Character c : arr) {
			sb.append(c);
		}
		System.out.println(sb);
	}
}
