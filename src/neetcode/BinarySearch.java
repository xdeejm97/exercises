package neetcode;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,1,3,4,5,7,8}, 1));

    }

    public static int search(int[] nums, int target) {

        int l = 0, r = nums.length - 1;

        while (l <= r){

            int m = l + ((r - l) / 2);
            if(nums[m] > target){
                r = m - 1;
            }else if (nums[m] < target){
                l = m + 1;
            }else {
                return m;
            }

        }
        return -1;

    }
}
