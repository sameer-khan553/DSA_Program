package linkedListProgram.reverseList;

public class LinkedList4 {

    Node head;


    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node  curr  =head;
        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = newNode;

    }


    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public void reversePrint() {
        Node current = head;
        Node prev = null;
        while (current != null ) {
          Node temp= current.next;
          current.next = prev;
          prev = current;
          current = temp;
        }
        head=prev;
    }
}
