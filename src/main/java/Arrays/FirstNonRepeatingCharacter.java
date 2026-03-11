package Arrays;

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
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }

        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
