package ArraysProgram;

public class Search {

    public static void main(String[] args) {

        int [] arr = { 1,2, 7, 9};
        int target = 7;
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            }
            else if(mid > target) {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }

    }

}
