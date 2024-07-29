package codewars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortTheODd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    public static int[] sortArray(int[] array) {
        int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] % 2 == 1){
                array[i] = sortedOdd[j++];
            }
        }

        return array;
    }
}
