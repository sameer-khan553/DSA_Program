package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_HashMap {

    public static void main(String[] args) {
        int[] arr = {1,6,8,4,9};
        int target = 17;
        int [] newArr =  twoSum(arr,target);
        System.out.println("These are the Arrays index of two sum: ");
        System.out.println(Arrays.toString(newArr));
    }

    public static int [] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)) {
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
}
