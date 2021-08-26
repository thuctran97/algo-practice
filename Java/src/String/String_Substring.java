package String;

public class String_Substring {
	public static void main(String[] args) {
		String a = "   ";
		String[] x = a.split("   ");
		System.out.println(x.length);
		String b = "";
		if (a.length()< b.length()) {
			System.out.println(isSubstring(a,b));
		} else {
			System.out.println(isSubstring(b, a));
		}
	}

	private static boolean isSubstring(String a, String b) {
		for (int i=1; i<= a.length(); i++) {
			for (int j=0; j<a.length()-i+1; j++) {
				String substr = a.substring(j,j+i);
				if (b.contains(substr)) {
					System.out.println(substr);
					return true;
				}
			}
		}
		return false;
	}
}
