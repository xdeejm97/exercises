package neetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5}));
    }

    public static int longestConsecutive(int[] nums) {


        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }

        int longest = 0;

        for (int n : nums){
            if(!numSet.contains(n - 1)){
                int length = 1;
                while (numSet.contains(n + length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;

    }


}
