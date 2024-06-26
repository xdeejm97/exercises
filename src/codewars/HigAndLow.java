package codewars;

import java.util.*;

public class HigAndLow {
    public static void main(String[] args) {
//        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        int[] a = new int[]{-1,-3,-6,-25,4,-3,5,6,7,-1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
    }
    public static String highAndLow(String numbers) {
        // Code here or
        List<Integer> numbersList = Arrays.asList(numbers.split(" ")).stream().map(Integer::parseInt).toList();
        return String.format("%s %s", Collections.max(numbersList), Collections.min(numbersList));
    }
}
