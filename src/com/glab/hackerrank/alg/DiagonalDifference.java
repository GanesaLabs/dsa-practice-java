package com.glab.hackerrank.alg;

public class DiagonalDifference {

	public static void main(String[] args) {
		int ar[][] = {{1, 2, 3, 6}, {4, 5, 6, 3}, {9, 8, 9, 5}, {6, 6, 9, 6}};
		
		for(int i=0 ; i < ar.length; i++) {
			for(int j=0; j < ar.length; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}
		
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][index]);
			index++;
			System.out.println("");
		}
		index = ar.length-1;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][index]);
			index--;
			System.out.println("");
		}
		
		System.out.println(diagonalDifference(ar));
	}

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	int diagonalOne = 0;
    	int diagonalOneIndex = 0;
    	int diagonalTwo = 0;
    	int diagonalTwoIndexs = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][diagonalOneIndex]);
			diagonalOne += arr[i][diagonalOneIndex];
			diagonalOneIndex++;
			
			System.out.print(arr[i][diagonalTwoIndexs]);
			diagonalTwo += arr[i][diagonalTwoIndexs];
			diagonalTwoIndexs--;
			System.out.println("");
		}
		System.out.println(Math.abs(10));
		return Math.abs(diagonalOne - diagonalTwo);
    }

}
