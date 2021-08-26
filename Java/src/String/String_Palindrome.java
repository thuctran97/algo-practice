package String;
import java.util.*;
public class String_Palindrome {
	public static boolean checkPalindrom(String st) {
		for (int i=0; i<st.length()/2; i++) {
			if (st.charAt(i)!=st.charAt(st.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String st = "aaaa";
		System.out.println(checkPalindrom(st));
	}
}
