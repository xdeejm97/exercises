package codewars;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
    }

    public static int duplicateCount(String text) {
        // Write your code here

        String[] array = text.split("");
        Arrays.sort(array);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (i + 1 < array.length && array[i].equalsIgnoreCase(array[i + 1])) {
                counter++;
            }
        }
        return counter;

    }
}
