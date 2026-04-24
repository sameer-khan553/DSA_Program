package ArraysProgram;

import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {

        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }

    public static int hIndex(int[] nums) {

        Arrays.sort(nums);
        for(int i= 0; i<nums.length; i++) {
            if(nums[i] >= nums.length-i) {
                return  nums.length-i;
            }
        }
        return 0;
    }
}
