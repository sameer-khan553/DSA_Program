package ArraysProgram;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,10};

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*(-1);
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
