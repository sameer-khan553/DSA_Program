package linkedListProgram;

public class Program1 {

    public static void main(String[] args) {

        LinkedList2.addFront(20);
        LinkedList2.addRear(10);
        LinkedList2.print();
        LinkedList2.insertMid(1, 15);
        System.out.println("After adding in the mid :");
        LinkedList2.print();

        LinkedList2.insertMid(0, 25);
        LinkedList2.print();
        LinkedList2.deleteFront();
        System.out.println("After deleting the front :");
        LinkedList2.print();


    }
}
