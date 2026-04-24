package linkedListProgram;

import java.util.Scanner;

public class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
        next = null;
    }

}

class Main {
    public static void main(String[] args) {
        Node head;
        System.out.println("enter a String with number");
        Scanner sc = new Scanner(System.in);
        String []str  = sc.nextLine().trim().split("\\s+");

         head = new Node(Integer.parseInt(str[0]));
         for(int i = 1; i < str.length; i++){
             head.next = new Node(Integer.parseInt(str[i]));
             head = head.next;
         }

        Node rev = reverse(head);
         printList(rev);



    }

    public  static Node reverse(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev= temp;
            temp = next;
        }
        return prev;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }



}