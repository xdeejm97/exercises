package codewars;

import java.util.*;

public class PosOrNeg {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(
                countPositivesSumNegatives(
                        new int[]{})));

    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0){
            return new int[]{};
        }

        int sum = 0, counter = 0;
        for (int a : input){
            if(a > 0)counter++;
            if(a < 0)sum += a;
        }


        return new int[]{counter,sum}; //return an array with count of positives and sum of negatives
    }
}
