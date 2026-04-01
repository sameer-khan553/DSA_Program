package ArraysProgram;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String  str = sc.next();
        char [] ch = str.toCharArray();
        char letter = firstNonRepeatingCharacter(str);
        System.out.println("first non repeating character is: " +  letter);
    }

    public static char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char x : str.toCharArray()){

                map.put(x, map.getOrDefault(x,0)+1);
            }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
