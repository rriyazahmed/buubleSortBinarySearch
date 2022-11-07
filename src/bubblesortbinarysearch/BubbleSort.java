package bubblesortbinarysearch;

public class BubbleSort {
	public static void main(String[] args) {

		int[] a = { 4, -1, 5, 3, 9 };
		System.out.println("the unsorted");
		for (int value : a) {
			System.out.print(value + " ");
		}
		SortingLogic.sort(a);
		System.out.println("the sorted array is: ");
		for (int value : a) {
			System.out.print(value + " ");
		}
		int val = 9;
		int n = a.length;
		int res = BinarySearch.binarySearch(a, 0, a.length - 1, val);
		System.out.print("The elements of the array are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Element to be searched is: " + val);
		if (res == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element is present at " + res + " position of array");

	}
}
