package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int [] arr= {7,2,3,4,5};
        int min = arr[0];
        for(int i= 0; i< arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("mininmum element: " + min);
    }
}
