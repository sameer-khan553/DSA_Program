package ArraysProgram;

import java.util.*;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "cbacdcbc";

        Set<Character> set = new TreeSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder(str);

        ArrayList<Character> list = new ArrayList<>(set);
        for(int i =0; i<list.size();i++){
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());
       }

    }
