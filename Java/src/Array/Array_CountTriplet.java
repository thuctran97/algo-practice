
package Array;
//https://www.hackerrank.com/challenges/count-triplets-1/problem
public class Array_CountTriplet {
	private static int k;
	private static int[] x;
	private static int result;
	public static void main(String[] args) {
		int n=5;
		int r=5;
		int[] a = {1,5,5,25,125};
		k=0;
		x=new int[n];
		result=0;
		generateTriplet(0,a,n,r);
		System.out.println(result);
	}

	private static void generateTriplet(int i, int[] a, int n, int r) {
		if (i==3) {
			if (a[x[1]]/a[x[0]]==r && a[x[2]]/a[x[1]]==r) {
				result++;
			}
		}
		int start = i==0?0:(x[i-1]+1);
		for (int j=start; j<n; j++) {
			x[i]=j;
			generateTriplet(i+1, a, n, r);
		}
		
	}
}
