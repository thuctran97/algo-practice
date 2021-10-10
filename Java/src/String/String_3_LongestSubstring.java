package String;

import java.util.HashMap;
import java.util.Map;

// Java program to find the length of the longest substring 
// without repeating characters 
public class String_3_LongestSubstring {
  
    static int longestUniqueSubsttr(String str) 
    { 
        int n = str.length(); 
        int cur_len = 0; // length of current substring 
        int max_len = 0; // result 
        int i; 
		Map<Character, Integer> visited = new HashMap<Character, Integer>();
        for (i = 0; i < n; i++) { 
            if (!visited.containsKey(str.charAt(i)) || i - cur_len > visited.get(str.charAt(i))) {
                cur_len++; 
            }
            else { 
                if (cur_len > max_len) 
                	max_len = cur_len; 
                cur_len = i - visited.get(str.charAt(i)); 
            } 
            visited.put(str.charAt(i), i);
        } 
        if (cur_len > max_len) 
            max_len = cur_len; 
  
        return max_len; 
    } 
    public static void main(String[] args) 
    { 
        String str = "abcabcbb"; 
        System.out.println("The input string is " + str); 
        int len = longestUniqueSubsttr(str); 
        System.out.println("The length of "
                           + "the longest non repeating character is " + len); 
    } 
} 