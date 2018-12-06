package basic;

public class Mtry {

	public static void main(String[] args) {
		int number[] = { 10, 50, 40, 20, 70 };

		System.out.println(getMaxNumber(number));
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

	public static boolean isNull(Object o) {
		return o == null;
	}

}
