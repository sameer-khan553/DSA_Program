package String;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Words_in_String {
    public static void main(String[] args) {
        System.out.println("Enter  a sentence");

        String str = new Scanner(System.in).nextLine();

        String[] words = str.split(" ");

        for(int i = words.length-1; i>=0;i--){
            System.out.print(words[i] + " ");
        }

    }
}
