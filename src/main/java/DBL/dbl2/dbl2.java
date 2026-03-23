package DBL.dbl2;

public class dbl2 {

    Node2 head;
    Node2 tail;
    int size;


    dbl2() {
        head = tail = null;
        size = 0;
    }


    public void insertFront(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    public void insertRear(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        size++;

    }


    public void insertMid(int index, int data) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == size) {
            insertRear(data);
            return;
        }

        if (index == 0) {
            insertFront(data);
            return;
        }

        Node2 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node2 newNode = new Node2(data);
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
        size++;

    }

    public void deleteFront() {

        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }

    }

    public void deleteRear() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }

        tail = tail.prev;
        tail.next = null;
        size--;

    }


    public void deleteMid(int index) {


        if(index < 0 || index > size) {
            return;
        }

        if(index == 0) {
            deleteFront();

        }
        if(index == size) {
            deleteRear();
        }

        Node2 temp = head;
        for(int i = 0; i < index; i++) {

            temp = temp.next;
        }
    }


    public void displayForward() {

        if (head == null) {
            System.out.println("list is empty ");
            return;
        }

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }

    public void displayBackward() {

        if (head == null) {
            System.out.println("list is empty ");
            return;
        }

        Node2 temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public int get(int index) {
        if(index < 0 || index > size) {
            return -1;
        }
            Node2 temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

    }

