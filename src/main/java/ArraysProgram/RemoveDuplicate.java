package ArraysProgram;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 3, 4, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        System.out.println("After Removing Duplicate: ");
        for(int y : set) {
            System.out.print(y + " ");
        }
    }
}