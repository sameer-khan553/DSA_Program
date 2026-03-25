package linkedListProgram.reverseList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();

        System.out.println("Enter a Integer String with separated coma");
        String str = new Scanner(System.in).nextLine().trim();
        String[] strArr = str.split(" ");

        int [] arr  =new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);

        }


        ll.insert(arr[0]);
        ll.insert(arr[1]);
        ll.insert(arr[2]);
        ll.insert(arr[3]);
        ll.insert(arr[4]);

        System.out.println("Original List");
        ll.print();
        ll.reversePrint();
        System.out.println("Reversed List");
        ll.print();
    }
}
