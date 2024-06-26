package codewars;

import java.util.Scanner;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] a = {3,2,4};
        int target = 6;
        twoSum(a, target);
    }
        public static int[] twoSum(int[] nums, int target) {

            for(int i = 1; i<nums.length;i++){

                for(int j = i;j<nums.length;j++){
                    if((nums[j] + nums[j-i] ) == target ){
                        return new int[]{j-i,j};
                    }

                }

            }
            return null;




    }
}
