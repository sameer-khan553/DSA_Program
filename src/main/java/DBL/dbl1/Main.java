package DBL.dbl1;

public class Main {
    public static void main(String[] args) {
        dbl1 dbl1 = new dbl1();
        dbl1.insertEnd(10);
        dbl1.insertEnd(20);
        dbl1.insertEnd(30);
        dbl1.insertEnd(40);
        dbl1.insertEnd(50);


        System.out.println("displayFront from front");
        dbl1.displayFront();
        System.out.println();
        System.out.println("displayFront from back side: ");
        dbl1.dislayBack();
    }
}
