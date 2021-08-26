package String;


public class String_PalindromeSubstring {
	public static boolean checkPalindrom(String st) {
		for (int i=0; i<st.length()/2; i++) {
			if (st.charAt(i)!=st.charAt(st.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void checkSubstring(String st, int subLength) {
		for (int i=0; i<= st.length()-subLength; i++) {
//			System.out.println("i: "+ i);
			String substring =  st.substring(i, i+subLength);
//			System.out.println("substring: "+ substring);
			if (checkPalindrom(substring)) {
				System.out.println(substring);
			}
		}
	}
	public static void main(String[] args) {
		String st = "nananan";
		for (int i=1; i<= st.length(); i++) {
			checkSubstring(st,i);
		}
	}
}
