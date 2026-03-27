package ArraysProgram;

import java.util.HashSet;

public class Practise {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = m1(str);
        System.out.println(res);
    }

    public static int m1(String str) {
        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max,i-left +1);
        }
        return max;

    }
}
