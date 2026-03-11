package String;

public class Test01 {
    public static void main(String[] args) {
        String s = "  hello     Boys  ";

        s =  s.trim();
        System.out.println(s);
        String [] strs = s.split("\\s+ ");

        System.out.println(strs.length);
    }
}
