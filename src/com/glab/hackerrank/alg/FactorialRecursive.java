package com.glab.hackerrank.alg;

public class FactorialRecursive {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

    // Complete the plusMinus function below.
	static int factorial(int n) {
		// Basic case
		if(n <= 1) {
			return n;
		}
		// Recursive case
		else {
			return n * factorial(n-1);
		}
	}

}
