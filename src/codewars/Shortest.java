package codewars;

import java.util.Arrays;

public class Shortest {
    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));

    }
    public static int findShort(String s) {



        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

}
