package linkedListProgram.l3;

class LinkedList3 {


    Node3 head;

    public void insert(int data) {
        if (head == null) {
            head = new Node3(data);
        }

        Node3 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node3(data);
    }


    public void display() {
        Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
