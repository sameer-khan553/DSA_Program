package tcsNqt_Practise;

public class Product_of_digit {
    public static void main(String[] args) {

        int n = 5244;
        int prod =1;
//        while(n > 0){
//            int digit = n % 10;
//            prod *= digit;
//            n = n/10;
//        }
//        System.out.println(prod);
//

        // approach 2

        char [] ch = String.valueOf(n).toCharArray();
        for(char x: ch){
            prod *= Integer.parseInt(String.valueOf(x));
       }

        System.out.println(prod);
    }



}
