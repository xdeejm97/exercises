package neetcode;

import java.util.Arrays;

public class DuplicateInt {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 3}));
    }

    public static boolean hasDuplicate(int[] nums) {

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {

            if (i+1 < nums.length && nums[i] == nums[i+1]) {
                return true;

            }
        }

        return flag;

    }

}
