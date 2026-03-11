package Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};


        System.out.println("before Sorted  array :");
        System.out.println(Arrays.toString(arr));


        // insertion sort
        for(int i =1; i<arr.length; i++) {
            int item  = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > item) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
        System.out.println("After sorting,  Array : ");
        for(int x: arr) {
            System.out.print(x +" ");
        }
// Approach 2 by using inBuilt Method
        Arrays.sort(arr);



    }





}
