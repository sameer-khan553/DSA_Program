package ArraysProgram;

import java.util.Scanner;
import java.util.Stack;

public class ReplaceVowel {
    public static void main(String[] args) {

        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println(reverseVowel(str));

    }

    public static String reverseVowel(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(isVowel(c)){
                sb.append(stack.pop());
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char ch) {

        return"aeiouAEIOU".indexOf(ch) != -1;
    }
}
