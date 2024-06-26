package codewars;

import java.math.BigDecimal;
import java.math.BigInteger;

public class EvenIndex {
    public static void main(String[] args) {
//        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        String n = "4";
        String a = String.valueOf((long)Math.floor(Math.sqrt(Long.parseLong(n))));
        System.out.println(a);

    }

    public static int findEvenIndex(int[] arr) {
        // your code

        for (int i = 0; i < arr.length; i++) {
            int sumL = 0;
            int sumR = 0;

            for (int j = 0; j <= i; j++) {
                sumL += arr[j];
            }

            for (int k = i; k < arr.length; k++) {
                sumR += arr[k];
            }
            if (sumR == sumL) {
                return i;
            }
        }

        return -1;
    }
}
