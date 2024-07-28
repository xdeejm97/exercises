package neetcode;

import java.util.HashMap;
import java.util.Map;

public class TopKElements {
    public static void main(String[] args) {


    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{};

        int counter = 1;
        for (int i = 0; i < nums.length; i++) {

                if(map.containsKey(nums[i])){
                    counter++;
                }
                if(!map.containsKey(nums[i])) {
                    map.put(nums[i], counter);
                }

        }
        return arr;
    }
}
