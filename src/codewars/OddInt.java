package codewars;

import java.util.Arrays;

public class OddInt {
    public static void main(String[] args) {


        anc(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1});


    }

    public static int anc(int[] a) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                }
            }

            if ((counter % 2) != 0) {
                return a[i];
            }
            counter = 0;

        }

        return -1;

    }
}
