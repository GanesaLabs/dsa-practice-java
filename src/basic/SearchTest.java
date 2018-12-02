package basic;

import com.glab.algorithms.search.GlabSearchIntUtil;

public class SearchTest {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 50, 60, 80, 110, 120, 130, 170 };

		// input
		int x = 170;

		// logic
//		int index = GlabSearchIntUtil.linearSearch(arr, x);
		int index = binarySearch(arr, x);

		// output
		GlabSearchIntUtil.printResult(x, index);

	}
	
	private static int binarySearch(int [] arr, int x) {
		int result = -1;
		
		int start = 0;
		int end = arr.length/2;
		for (int i=start; i < end;) {
			
			if(x > arr[start]) {
				start = end;
			} else {
				end = end;
			}
			
		}
		
		return result;
		
	}

}
