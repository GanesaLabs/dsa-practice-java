package com.glab.problemsolving.patterns;
/**
 * 
 * @author ganesa.vijayakumar
 * 
 * Simple pyramid pattern Reverse
 
 * * * * *
 * * * * 
 * * * 
 * * 
 * 
 
 *
 */

public class SimplePyramidPatternReverse {

	public static void main(String[] args) {
		simplePyramidPatternReverse(20);
	}

	public static void simplePyramidPatternReverse(int n) {
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
