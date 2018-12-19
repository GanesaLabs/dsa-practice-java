package com.glab.problemsolving.patterns;
/**
 * 
 * @author ganesa.vijayakumar
 * 
 * Simple pyramid pattern
 
 * 
 * * 
 * * * 
 * * * * 
 * * * * *
 
 *
 */

public class SimplePyramidPattern {

	public static void main(String[] args) {
		simplePyramidPattern(20);
	}

	public static void simplePyramidPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
