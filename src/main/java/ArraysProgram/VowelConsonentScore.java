package ArraysProgram;

public class VowelConsonentScore {
    public static void main(String[] args) {
        String str = "cooear".toLowerCase();
        int vowel  = 0;
        int consonent = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowel++;
            }
            else {
                consonent++;
            }
        }
        System.out.println(vowel/consonent);
    }
}
