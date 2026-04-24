package ArraysProgram;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int t = sc.nextInt();
        System.out.println("enter word");
            String[] arr = new String[t];
            for(int i=0;i<t;i++){
                arr[i] = sc.next();
            }
                for(List<String> groups : groupAnagrams(arr)){
                    System.out.println(groups +  " ");
                }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());

    }
}
