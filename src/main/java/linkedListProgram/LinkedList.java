package linkedListProgram;

public class LinkedList {


    Node head = null;

    void insertRear(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;    // agr head empty h to newNode element will be stored inside head
            return;
        }
        Node temp = head;      // if head is not null then we will create a temp node and assign head inside temp
        while (temp.next != null) {     // again temp.next is not null then we will update temp with it next element
            temp = temp.next;
        }
        temp.next = newNode;      // and then newNode (element)will be stored inside temp.next
    }


    void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    void insertFront(int data) {
        Node newNode = new Node(data);     // taking  data in form of object
        newNode.next = head; // newNode.next should be head because we are inserting at the front
        head = newNode;     // now assigning the newNode to the head
    }
}
