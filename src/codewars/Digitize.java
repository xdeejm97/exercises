package codewars;

import java.util.Arrays;

public class Digitize {
    public static void main(String[] args) {
        System.out.println(1 % 10);
        System.out.println(Arrays.toString(digitize(123)));

    }

    public static int[] digitize(int n) {
        int[] array = new int[String.valueOf(n).length()];

        int copy = n;
        int i = array.length - 1;
        while (copy != 0) {
            int modulo = copy % 10;
            array[i] = modulo;
            i--;
            copy /= 10;

        }
        return array;

    }
}
