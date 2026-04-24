package ArraysProgram;

import java.util.*;

public class Practise_01 {
    public static void main(String[] args) {

        String str = "abcabcaa";
        int j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            while(set.contains(ch)){
                set.remove(str.charAt(j));
                j++;
            }
            set.add(ch);
            max = Math.max(max, i - j + 1);
        }
        System.out.println(max);
    }
}