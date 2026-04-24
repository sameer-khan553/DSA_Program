package ArraysProgram;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;

        int rev = 0;
        while (x != 0) {
            int digit = x%10;
            x = x/10;


            // OverFlow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println(0);
            }

            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
