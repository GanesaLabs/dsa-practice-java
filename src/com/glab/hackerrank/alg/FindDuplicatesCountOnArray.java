package com.glab.hackerrank.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesCountOnArray {

	public static void main(String[] args) {
		Integer arr[] = null;
		System.out.println(findDuplicatesCountOnArray(arr));
	}

	public static int findDuplicatesCountOnArray(Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		if (arr != null) {
			list.addAll(Arrays.asList(arr));
		}
		HashSet<Integer> set = new HashSet<Integer>(list);
		return list.size() - set.size();
	}
}
