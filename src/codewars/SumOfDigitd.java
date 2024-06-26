package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigitd {

    public static void main(String[] args) {

        int n = 231;

        while (n > 9){

            n = n / 10 + n % 10;

        }
        System.out.println(n);

    }
}
