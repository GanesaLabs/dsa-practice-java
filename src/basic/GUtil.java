package basic;

public class GUtil {

	
	// Numbers
	public static int getMaxNumber(Integer n1, Integer n2) {
		n1 = isNull(n1) ? 0 : n1;
		n2 = isNull(n2) ? 0 : n2;
		return n1 > n2 ? n1 : n2;
	}
	
	public static int getMaxNumber(int[] array) {
		int result = 0;
		if (!isEmpty(array)) {
			for (int i = 0; i < array.length; i++) {
				result = result > array[i] ? result : array[i];
			}
		}
		return result;
	}

	public static boolean isEmpty(int[] array) {
		return isNull(array) || array.length < 1;
	}
	
	// Objects
	public static boolean isNull(Object o) {
		return o == null;
	}
}
