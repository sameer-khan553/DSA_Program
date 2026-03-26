package Arrays;




public class Single_Element {


    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {

        int res = 0;
        for (int x : nums) {
            res ^= x;
        }
        return res;
    }
}
