package ArraysProgram;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int rot = 2;
        rotate(arr, rot);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }

        ///  copy back to in arr

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
