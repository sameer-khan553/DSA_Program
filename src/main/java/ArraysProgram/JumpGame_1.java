package ArraysProgram;

public class JumpGame_1 {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,3,5};
        ;
        if(canJump(arr)) {
            System.out.println("yes you can reach in the end ");
        }
        else{
            System.out.println("no you can not reach in the end ");
        }
    }

    public static boolean canJump(int [] nums) {
        int maxReach = 0;
        for(int i= 0; i< nums.length; i++){
            if(i>maxReach){
                return false;
            }
            maxReach  = Math.max(maxReach, i+nums[i]);
        }
        return true;

    }
}
