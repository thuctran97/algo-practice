package Graph;

import java.util.Arrays;
//https://geehye.github.io/hackerrank-09/#
public class Greedy_MaxMin {
	public static void main(String[] args) {
		int n = 10;
		int m = 4;
//		int a[] = { 10, 100, 300, 200, 1000, 20, 30 };
		int a[] = { 1,2,3,4,10,20,30,40,100,200};
		Arrays.sort(a);
		int min=1000000;
		for (int i=0; i<n-m+1; i++) {
			int unfaireness= a[i+m-1]-a[i];
			if (unfaireness<min) {
				min = unfaireness;
			}
		}
		System.out.println(min);
	}
}
