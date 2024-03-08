package project;

public class FindMinimum {

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int findMinimum(int[] arr) {
		// edge case
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid Input");
		}

		int min = arr[0]; // min will hold the minimum value of array
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 3, 15, 1, 2 };
		System.out.println("This is the array");
		printArray(arr);
		FindMinimum ma = new FindMinimum();
		System.out.println("This is the minimum of the array");
		System.out.println(ma.findMinimum(arr));

	}

}
