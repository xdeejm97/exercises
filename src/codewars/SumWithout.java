package codewars;

import java.util.Arrays;

public class SumWithout {
    public static void main(String[] args) {

    }

    public static int sum(int[] numbers) {
        int num = 0;
        Arrays.sort(numbers);
        if(numbers == null){
            return 0;
        }

        for (int i = 1; i < numbers.length - 1; i++) {
            num += numbers[i];
        }

        return num;

    }

}
