package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//https://www.hackerrank.com/challenges/ctci-ransom-note/problem
public class String_RansomeNote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nx=6;
		int ny=4;
		String x = "give me one grand today night";
		String y = "give one grand today";
		System.out.println(checkMagazine(x,y,nx,ny));
		sc.close();
	}

	private static boolean checkMagazine(String x, String y, int nx, int ny) {
		String[] arrX = x.split(" ");
		String[] arrY = y.split(" ");
		Map<String, Integer> mapStr = new HashMap<>();
		for (int i=0; i<nx; i++) {
			if (mapStr.containsKey(arrX[i])) {
				mapStr.replace(arrX[i], mapStr.get(arrX[i])+1);
			} else {
				mapStr.put(arrX[i], 1);
			}
		}
		for (int j=0; j<ny; j++) {
			String key = arrY[j];
			if (mapStr.containsKey(key)) {
				int value = mapStr.get(key);
				if (value>1) {
					mapStr.replace(key, value-1);
				} else {
					mapStr.remove(key);
				}
			} else {
				return false;
			}
		}
		return true;
	}

}
