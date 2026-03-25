package Arrays;

import java.util.Arrays;

public class TripleSum_With_Zero {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};

        boolean res = tripletSum(arr);
        System.out.println("result: " + res);
    }
        public static boolean tripletSum(int [] arr) {


        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = arr[i] + arr[low] + arr[high];

                if(sum == 0) {
                    return true;
                }
                else if(sum < 0) low++;
                else high--;
            }
            System.out.println(arr[i] + arr[low] + arr[high]);
        }


        return false;
    }

}
