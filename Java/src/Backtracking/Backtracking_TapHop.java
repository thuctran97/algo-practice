package Backtracking;

public class Backtracking_TapHop {
	public static int[] result = new int[3];
	public static char x[] = new char[5];
	public static boolean[] trace = new boolean[5];
	public static void sinh(int i) {
		if (i==3) {
			for (int j=0; j<3; j++) {
				System.out.print(x[result[j]]+" ");
			}
			System.out.println();
			return;
		}
		for (int j=0; j<5; j++) 
		if (!trace[j]){
			result[i]=j;
			trace[j]= true;
			sinh(i+1);
			trace[j]=false;
		}
	}
	public static void main(String[] args) {
		x[0]='a';
		x[1]='b';
		x[2]='c';
		x[3]='d';
		x[4]='e';
		sinh(0);
	}

}
