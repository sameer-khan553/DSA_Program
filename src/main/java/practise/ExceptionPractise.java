package practise;

public class ExceptionPractise {
   static public int test() {
        try{
            return 10/0;

        }catch (Exception e){
            return -1;
        }
        finally{
            System.out.println("finally executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
