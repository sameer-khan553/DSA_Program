package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Single_Element {


    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }


    public static int singleNumber(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int x : nums) {

            map.put(x, map.getOrDefault(x, 0) + 1);

            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue() == 1) {
                    return m.getKey();

                }


            }
        }
        return -1;
    }


    // 2nd Approach ->

//        int res = 0;
//            for(int x : nums) {
//                res  ^= x;
//
//                return res;
//    }

}
