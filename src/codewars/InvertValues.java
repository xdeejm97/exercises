package codewars;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(invert(new int[]{1,2,3,-4,-5})));

    }
    public static int[] invert(int[] array) {

//        for (int i = 0; i < array.length; i++) {
//            array[i] *= -1;
//        }


        return Arrays.stream(array).map(s -> s * -1).toArray();
    }


}
