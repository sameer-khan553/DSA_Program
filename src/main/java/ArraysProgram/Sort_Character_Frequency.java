package ArraysProgram;

import java.util.*;

public class Sort_Character_Frequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->map.get(b)-map.get(a));

        StringBuilder sb = new StringBuilder();
        for(Character c : list){
            int freq =  map.get(c);
            while(freq-- > 0){
                sb.append(c);

            }
        }
        return sb.toString();
    }
}
