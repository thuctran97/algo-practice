package Math;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Seven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		double h = sc.nextDouble();
		double ch = Math.sqrt(Math.pow(a/2,2)+Math.pow(h, 2));
		double result = a*h/(ch*2);
		System.out.println(new DecimalFormat("##.0000").format(result));
	}
}
