package ArraysProgram;

public class Leetcode1 {
    public static void main(String[] args) {

        char [] c = {'h', 'e',  'l', 'l', 'o'};

        StringBuilder sb = new StringBuilder();
        for(int i = c.length-1;i>=0;i--){
            sb.append(c);
            break;
        }

        System.out.println(sb.toString());
    }
}
