package Array;

import java.util.*;

public class Sorting_49_GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str: strs){
            char[] cstr = str.toCharArray();
            Arrays.sort(cstr);
            String sortedStr = new String(cstr);
            if (anagramMap.containsKey(sortedStr)){
                anagramMap.get(sortedStr).add(str);
            } else {
                List<String> resultStr = new ArrayList<>();
                resultStr.add(str);
                anagramMap.put(sortedStr, resultStr);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key: anagramMap.keySet()){
            result.add(anagramMap.get(key));
        }
        return result;
    }
}
