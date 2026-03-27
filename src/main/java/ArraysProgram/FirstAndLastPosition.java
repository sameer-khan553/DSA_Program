package ArraysProgram;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int [] nums = {5,7,7,8,8,10};
        int target = 6;

        int first = firstOccurance(nums, target);
        int last  = lastOccurance(nums, target);

        int [] arr  = new int[]{first,last};

        System.out.println(Arrays.toString(arr));

    }




    public static int firstOccurance(int[] nums , int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;    // move left

            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return ans;
    }


    public static int lastOccurance(int[] nums , int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right ){
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;  // move right

            }
            else if(nums[mid] < target) {
                left = mid + 1;

            }
            else {
                right = mid -1;

            }
        }
        return ans;
    }
}
