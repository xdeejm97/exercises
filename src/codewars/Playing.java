package codewars;

import java.util.Arrays;
import java.util.Enumeration;

public class Playing {
    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
    }
    public static long digPow(int n, int p) {
        // your code
        long sum = 0;

        String[] array = String.valueOf(n).split("");
        for (String s : array) {
            sum += (long) Math.pow(Long.parseLong(s), p++);
        }

        long k = sum / n;
        if (k * n == sum){
            return k;
        }else {
            return -1;
        }

    }
}
