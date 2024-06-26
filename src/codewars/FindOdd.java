package codewars;

import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20}));

    }

    public static int findIt(int[] a) {

        Arrays.sort(a);
        int counter = 1;

        for (int i = 0; i < a.length; i++) {

            if (i + 1 < a.length && a[i] == a[i + 1]) {
                counter++;
            } else {
                if (counter % 2 != 0) {
                    return a[i];
                }
                counter = 1;
            }
        }
        return 0;

    }

}

