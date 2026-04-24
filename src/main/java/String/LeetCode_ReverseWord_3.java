package String;

public class LeetCode_ReverseWord_3 {
    public static void main(String[] args) {
        ;
        
        // Test cases
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("JavaScript is fun"));
    }

    public  static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse().toString());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
