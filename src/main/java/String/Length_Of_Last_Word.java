package String;

import java.util.Scanner;

public class Length_Of_Last_Word {
    public static void main(String[] args) {

        System.out.println("Enter the sentence: ");
        String str = new Scanner(System.in).nextLine().trim();


        String [] strArr = str.split(" ");

        String word  = strArr[strArr.length-1];

        System.out.println("length of the last word is: "+word.length());


    }
}
