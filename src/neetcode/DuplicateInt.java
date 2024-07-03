package neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInt {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 3}));
    }

    public static boolean hasDuplicate(int[] nums) {

        Set<Integer> arraySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(arraySet.contains(nums[i])){
                return true;
            }
            arraySet.add(nums[i]);
        }
        return false;

    }

}
