package codewars;

import java.util.Arrays;

public class Seats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1,2,3,-4,5,-6})));

    }

    public static int[] invert(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }
}
