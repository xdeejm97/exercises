package codewars;

import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
    public static int[] reverse(int n){
        //your code
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = i;
        }


        return array;

    }
}
