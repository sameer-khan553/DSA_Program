package tcsNqt_Practise;

public class remove_Alphabet {
    public static void main(String[] args) {

        String s = "4523EF58G";

        s =s.replaceAll("[a-zA-Z]","");

        System.out.println(s);

    }
}
