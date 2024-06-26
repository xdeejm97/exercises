package codewars;

import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1}, new int[]{1,2,2})));

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        int[] newArr = new int[a.length -1];
        int k = 0;
        if(a.length == 0){
            return a;
        }
        for (int c : a) {
            for (int d : b) {
                if (c != d) {
                    newArr[k] = c;
                    k++;

                }
            }
        }


        return newArr;
    }
}
