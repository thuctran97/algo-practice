package String;

import java.io.*;
import java.util.*;

class String_MakingAnagram {
	public static Map<Character, Integer> getCharacterMap(String s){
		Map<Character, Integer> map= new HashMap<>();
		for (int i=0; i< s.length(); i++){
			char c = s.charAt(i);
			int count = map.containsKey(c)?map.get(c):0;
			map.put(c, count+1);
		}
		return map;
	}
	public static void main(String[] args) {
		String s1 = "cde";
		String s2 = "abc";
		int result = s1.length()+s2.length();
		// System.out.println("result: "+result);
		Map<Character, Integer> map1 = getCharacterMap(s1);
		Map<Character, Integer> map2 = getCharacterMap(s2);
		for (char c : map1.keySet()){
			if (map2.containsKey(c)){
				int similar = Math.min(map1.get(c), map2.get(c));
				result -= similar*2;
			}
		}
		System.out.println("result: "+result);

	}
}
