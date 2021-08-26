package Test;

import java.util.Iterator;
import java.util.Scanner;

class TreeSet_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		java.util.TreeSet<Integer> setNum = new java.util.TreeSet<Integer>();
		int num;
		do {
			 num = sc.nextInt();
			 setNum.add(num);
		} while (num!=0);
		Iterator<Integer> iter = setNum.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		sc.close();
	}
}
