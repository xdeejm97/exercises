package codewars;

import java.util.Arrays;

public class Needle {
    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }

    public static String findNeedle(Object[] haystack) {
        // Your code here


        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");

    }
}
