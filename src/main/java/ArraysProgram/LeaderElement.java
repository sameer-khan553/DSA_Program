package ArraysProgram;

import java.util.ArrayList;
import java.util.List;

public class LeaderElement {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(arr[i]);
            }

        }

        System.out.println(list);
        System.out.println(Integer.MAX_VALUE);
    }
}
