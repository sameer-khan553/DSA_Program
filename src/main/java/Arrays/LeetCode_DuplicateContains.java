package Arrays;

import java.util.HashMap;

public class LeetCode_DuplicateContains {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate(arr,k));
    }

    public static  boolean containsDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int prev = map.get(nums[i]);

                if(i-prev <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
