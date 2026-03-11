package Arrays;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr= {1,2,3,3,4,4,5};

//        for(int i = 0; i<arr.length-1; i++) {
//            if(arr[i] == arr[i+1]){
//                System.out.print(arr[i] + " ");
//            }
//        }


//        Approach 2

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr) {
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}
