package ArraysProgram;

public class Subarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]+" ");
                    sum += arr[k];

                }
                max = Math.max(max, sum);
                // System.out.print("  ,sum  -> : "+sum);
               // System.out.println();
            }
        }
        System.out.println("maximum subArray Sum: " + max);
    }
}
