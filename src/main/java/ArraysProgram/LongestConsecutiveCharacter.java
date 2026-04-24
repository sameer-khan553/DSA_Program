package ArraysProgram;

public class LongestConsecutiveCharacter {
    public static void main(String[] args) {

        String str = "aaaaabbbcc";
        System.out.println(consecutiveCharacter(str));
    }


    public static char consecutiveCharacter(String str) {
        int maxCount = 0;
        int count = 0;
        char ch = str.charAt(0);
        for(int i =1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else {
                count = 1;
            }

            if(count > maxCount){
                maxCount = count;
                ch = str.charAt(i);

            }
        }
        return ch;
    }

}
