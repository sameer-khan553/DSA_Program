package math;

public class Armastrong_Number {
    public static void main(String[] args) {
        System.out.println(armastrong(123));
    }

    public static  boolean armastrong(int n){
        int originalN = n;
        int sum = 0;
        while(n>0) {
            int digit = n %10;
                sum += digit*digit*digit;
                n = n/10;

        }
        if(sum == originalN) {
            return true;
        }
        return false;
    }
}
