package ArraysProgram;

public class Sum_EvenNumber {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7,8,3,9};

        int sum = 0;

        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers is "+sum);
    }
}
