package String;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println("After Reverse: " + sb.toString());
    }
}
