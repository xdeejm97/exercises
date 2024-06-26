package codewars;

import java.util.Arrays;

public class ArraySmall {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s) {
        String[] a = s.split("[_-]");
        String res = a[0];
        for (int i = 1; i < a.length; i++) {
            res += a[i].substring(0,1).toUpperCase();
            res += a[i].substring(1);
        }

        return res;
    }
}
