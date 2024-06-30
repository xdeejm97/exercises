package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] lettersNumber = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lettersNumber[s.charAt(i) - 'a']++;
            lettersNumber[t.charAt(i) - 'a']--;
        }
        for (int res : lettersNumber) if(res != 0) return false;

//        Map<String, Integer> a = new HashMap<>();
//        Map<String, Integer> b = new HashMap<>();
//
//        a.put("a", 3);
//        b.put("a", 3);
//        b.put("b", 1);
//        b.put("c", 1);
//        b.put("d", 1);;
//        a.put("b", 1);
//        a.put("c", 1);
//        a.put("d", 1);
//        int counter = 0;
//        for (int i = 0; i < a.size(); i++) {
//
//
//            if(a.get(i).equals(b.get(i))){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        return true;
    }
}
