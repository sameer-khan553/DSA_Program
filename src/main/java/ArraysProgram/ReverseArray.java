package ArraysProgram;


public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        // approach 1 by using  for loop
        System.out.print("by using for loop: ");
        for(int i = arr.length-1;i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // approach 2 by using  while loop

        reverse(arr);

    }

    public  static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int x :arr) {
            System.out.print(x + " ");
        }
    }
}
