package project;

public class RemoveEvenInt {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 10, 9, 12, 15, 2, 2, 5, 7, 27 }; // removes the even numbers
		printArray(arr);
		int[] result = removeEven(arr);
		printArray(result);
	}

}
