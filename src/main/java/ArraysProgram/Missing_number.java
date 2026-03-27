package ArraysProgram;

public class Missing_number {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,5};

        int n = arr.length+1;

        int actualSum  = n*(n+1)/2;
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }


        System.out.println(actualSum- sum);
    }
}
