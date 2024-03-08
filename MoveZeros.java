package project;

public class MoveZeros {

	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void arrayDemo() {
		int[] arr = { 8, 1, 0, 2, 1, 0, 3 };
		System.out.println("This is the array");
		printArray(arr);
		System.out.println("Now this is the array with zeros at the end");
		moveZero(arr, arr.length);
		printArray(arr);
	}

	public void moveZero(int[] arr, int n) {
		int j = 0; // focus on the zeroth element
		for (int i = 0; i < n; i++) { // 'i' will focus on non zero elements
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i]; // swapping the values
				arr[i] = arr[j];
				arr[j] = temp;
			}

			if (arr[j] != 0) {
				j++;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeros arrUtil = new MoveZeros();
		arrUtil.arrayDemo();
	}

}
