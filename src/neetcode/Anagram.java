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

        return true;
    }
}
