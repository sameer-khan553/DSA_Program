package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class product_ofArray_except_itself {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("enter the " + (i+1) + "th element of the array");
            arr[i] = sc.nextInt();
        }

       int[] newArr =  product_ofArrays_except_itself(arr);

        System.out.println(Arrays.toString(newArr));
    }


    public static int[] product_ofArrays_except_itself(int[]arr){

        int [] res=  new int[arr.length];
        int left = 1;
        int right = 1;

        for(int i=0; i<arr.length; i++){
            res[i] = left;
            left *= arr[i];
        }

        for(int i = arr.length-1; i>=0; i--){
            res[i] *= right;
            right *= arr[i];
        }

        return res;
    }
}
