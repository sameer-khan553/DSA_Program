package String;

public class LeetCodeTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String [] s1 = {"a", "cb"};
        String [] s2 = {"ab", "c"};

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < s1.length; i++){
            sb1.append(s1[i]);
        }

        for(int i = 0; i < s2.length; i++){
            sb2.append(s2[i]);
        }

        String str =  sb1.toString();
        String str2 = sb2.toString();

        if (str.equals(str2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
