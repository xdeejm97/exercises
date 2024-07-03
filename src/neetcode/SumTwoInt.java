package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SumTwoInt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3, 4, 6}, 7)));

    }
    public static int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
    public static int quarterOf(int month) {
        // Your code here

        return month <=3 ? 1 : month <=6 ? 2 : month <=9 ? 3 : 4;

    }
}
