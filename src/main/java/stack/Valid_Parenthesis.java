package stack;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("entera string: ");
     String str = sc.nextLine();

        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

            for(char ch : str.toCharArray()) {
                if(ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                else {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();

                    if((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{' )||
                            (ch==']' && top != '[')){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
    }
}