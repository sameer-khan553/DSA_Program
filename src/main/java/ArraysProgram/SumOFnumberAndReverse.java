package ArraysProgram;

public class SumOFnumberAndReverse {
    public static void main(String[] args) {
        int num = 443;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            sum += rem;
        }
        System.out.println(sum);


    }
}
