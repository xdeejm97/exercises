package Loop.leetcode;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"fajt" ,"flight","flow","flower"});
        System.out.println("_____________________");

        String[] strs = {"fajt" ,"flight","flow","flower"};

        if(strs == null || strs.length == 0){
            System.out.println("");
        }

        String s1 = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            while (j < s1.length() && j < strs[i].length() && s1.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            s1 = s1.substring(0, j);
            if (s1.isEmpty()) {
                System.out.println("");
            }

        }
        System.out.println(s1);



    }

        public static String longestCommonPrefix(String[] strs) {

                if (strs.length == 0) {
                    return "";
                }

                String str = strs[0];
                for (int i = 1; i < strs.length; i++) {
                    while (strs[i].indexOf(str) != 0) {
                        str = str.substring(0, str.length() - 1);
                        if (str.isEmpty()) {
                            return "";
                        }
                    }
                }
                return str;
            }

    }


