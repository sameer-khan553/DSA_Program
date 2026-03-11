package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s).reverse();
        String reverse = sb.toString();

        if(s.equals(reverse)){
            System.out.println("Yes  String is  palindrome");
        }
        else {
            System.out.println("this is not palindrome");
        }
    }
}
