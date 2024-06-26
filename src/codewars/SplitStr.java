package codewars;

import java.util.Arrays;

public class SplitStr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcedalo")));

    }
    public static String[] solution(String s) {
        //Write your code here

        s = (s.length() % 2 == 0) ? s : s+"_";

        return s.split("(?<=\\G.{2})");

    }
}
