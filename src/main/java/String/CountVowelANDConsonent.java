package String;

import java.util.Scanner;

public class CountVowelANDConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        int vowel = 0;
        int cons = 0;

        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Total Vowel: " + vowel);
        System.out.println("Total Consonent: "+ cons);
    }
}
