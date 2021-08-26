package Array;

import java.util.Scanner;

public class Array_KMS_Test {
	public static boolean checkSum(int n) {
		int sum = 0;
		if (n > 3) {
			for (int i=2; i*i <= n; i++) {
				if (n % i == 0) {
					if (i*i != n) {
						sum += i + n / i;
					} else {
						sum += i;
					}
					if (sum >= n) {
						return false;
					}
				}
			}
		}
		if (sum + 1 == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] cases = new int[t];
		for (int i = 0; i < t; i++) {
			cases[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {
			if (checkSum(cases[i])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
