package codewars;

import java.util.Arrays;

public class PersistenBugger {
    public static void main(String[] args) {
//        System.out.println(2%10);
        System.out.println(persistence(9));

    }

    public static int persistence(long n) {
        short counter = 0;
        while (n >= 10) {
            long num = 1;
            String[] array = String.valueOf(n).split("");

            for (String a : array) {
                num *= Long.parseLong(a);
            }
            n = num;
            counter++;

        }


        return counter; // your code
    }


}
