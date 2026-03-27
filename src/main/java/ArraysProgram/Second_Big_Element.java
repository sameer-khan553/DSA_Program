package ArraysProgram;

import java.util.Arrays;

public class Second_Big_Element {

    public static void main(String[] args) {
            int [] arr = {4,2,3,1,5};

            Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
