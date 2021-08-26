package Graph;

//https://dottak.github.io/algorithm/2020/04/15/Minimum-Absolute-Difference-in-an-Array/
public class Greedy_MinAbsolute {
	public static void main(String[] args) {
		int n=5;
//		int a[] = {-59,-36,-13,1,-53,-92,-2,-96,-54,75};
		int a[] = {1,-3,71,68,17};
		
		java.util.Arrays.sort(a);
		int min=1000000;
		for (int i=0; i<n-1; i++) {
			int absol = Math.abs(a[i]-a[i+1]);
			if (absol <min) {
				min = absol;
			}
		}
		System.out.println(min);
	}
}
