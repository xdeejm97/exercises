package codewars;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

    }

    public static double findUniq(double arr[]) {
        // Do the magic

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if(i+1 < arr.length && arr[i] != arr[i+1]){
                return arr[i];
            }
        }

        return arr[0];
    }
}
