package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int target = 7;
//        int left = 0;
//        int right = arr.length-1;
//        while(left < right) {
//            int sum = arr[left] + arr[right];
//            if(sum == target) {
//                System.out.println("found element: " +arr[left] +  "," + arr[right] );
//                    break;
//            } else if (sum > target ) {
//                right--;
//
//            }
//            else {
//                left++;
//            }
//
//        }
//
//        Brute Force Approach

        for(int i= 0; i< arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] ==  target) {
                    System.out.println("Found: " + arr[i] +"," + arr[j]);
                    break;
                }
            }
        }
    }
}
