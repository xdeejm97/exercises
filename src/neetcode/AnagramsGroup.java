package neetcode;

import java.util.*;

public class AnagramsGroup {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){

            int[] array = new int[26];
            for (char c : s.toCharArray()){
                array[c - 'a']++;
            }

            String key = Arrays.toString(array);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }

        return new ArrayList<>(map.values());
    }
}
