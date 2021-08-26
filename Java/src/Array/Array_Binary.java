package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 6, 4, 3, 2, 5 };
		Arrays.sort(a);
		binarySearch(0, a.length - 1, a, 5);
		sc.close();
	}

	private static void binarySearch(int start, int finish, int[] a, int x) {
		int middle = (start + finish) / 2;
		System.out.println(middle);
		if (a[middle] == x) {
			System.out.println("result: " + middle);
			return;
		} else {
			if (start == finish) {
				System.out.println("not found");
				return;
			}
			if (a[middle] < x) {
				binarySearch(middle + 1, finish, a, x);
			} else {
				binarySearch(start, middle - 1, a, x);
			}
		}
	}

	private static int binarySearch(int start, int finish, int key, int a[]) {
		while (start <= finish) {
			int mid = (start + finish) / 2;
			if (a[mid] < key) {
				start = mid + 1;
			} else if (a[mid] > key) {
				finish = mid - 1;
			} else {
				return mid;
			}
		}
		return -1; 
	}
}
