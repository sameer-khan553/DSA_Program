package Arrays;

public class LeetCode_REMOVE_DUPLICATE {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {

    int k = 2;

    for(int i=2; i<nums.length; i++){
        if(nums[i]!= nums[k-2]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
    }
}
