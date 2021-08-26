package String;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class String_RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = "aabcdeb";
		removeDuplicate(x);
		sc.close();
	}

	private static void removeDuplicate(String x) {
		Set<Character> charSet = new LinkedHashSet<>();
		for (int i=0; i<x.length(); i++) {
			if (charSet.contains(x.charAt(i))) {
				charSet.remove(x.charAt(i));
			} else {
				charSet.add(x.charAt(i));
			}
		}
		Iterator<Character> iter = charSet.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
	}

}
