package project;

public class FindSecondMaxInt {

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int findSecondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 13, 34, 2, 34, 33, 2 };
		System.out.println("The array that we need to find the 2nd max");
		printArray(arr);
		System.out.println("This is the second 2nd max array of the list");
		FindSecondMaxInt mx = new FindSecondMaxInt();
		System.out.println(mx.findSecondMax(arr));
	}

}
