package linkedListProgram.l1;

public class LinkedList1 {


    Node1 head = null;

    void insertRear(int data) {
        Node1 newNode1 = new Node1(data);
        if (head == null) {
            head = newNode1;    // agr head empty h to newNode element will be stored inside head
            return;
        }
        Node1 temp = head;      // if head is not null then we will create a temp node and assign head inside temp
        while (temp.next != null) {     // again temp.next is not null then we will update temp with it next element
            temp = temp.next;
        }
        temp.next = newNode1;      // and then newNode (element)will be stored inside temp.next
    }


    void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    void insertFront(int data) {
        Node1 newNode1 = new Node1(data);     // taking  data in form of object
        newNode1.next = head; // newNode.next should be head because we are inserting at the front
        head = newNode1;     // now assigning the newNode to the head
    }
}
