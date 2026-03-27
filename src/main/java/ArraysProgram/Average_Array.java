package ArraysProgram;

public class Average_Array {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg =  sum/arr.length;

        System.out.println("Average is "+avg);
    }
}
