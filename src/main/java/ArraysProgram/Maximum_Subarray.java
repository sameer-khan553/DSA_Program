package ArraysProgram;

public class Maximum_Subarray {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));
    }

    public static  int  maxSubArray(int[] nums) {

        int currentSum = 0;

        int maxsum =  Integer.MIN_VALUE;

        for(int num : nums) {
            currentSum += num;


            if (currentSum > maxsum) {
                maxsum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxsum;
    }
}
