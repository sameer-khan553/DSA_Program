package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_SubString_Without_Repeating_Any_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine().toLowerCase();

       int length = longestSubstring(str);
        System.out.println(length);

    }

    public static int longestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int j = 0;
    int max = Integer.MIN_VALUE;

    for(int i= 0; i<s.length(); i++){
        char ch = s.charAt(i);
        while(set.contains(ch)){
        set.remove(s.charAt(j));
        j++;
        }
        set.add(ch);
        max = Math.max(max,i- j+1);
    }
    return max;
    }
    }