package ArraysProgram;

public class JumpGame_2 {
    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
       int maxReach = 0;
       int count = 0;
       int end= 0;
       for(int i=0;i<nums.length;i++){
           maxReach = Math.max(maxReach,i+nums[i]);
           if(i==end) {
               count++;
               end = maxReach;
           }
       }
       return count;
    }
}
