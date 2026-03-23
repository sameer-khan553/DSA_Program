package DBL.dbl1;

public class dbl1 {
    Node1 head;
    Node1 tail;


    dbl1(){
        head = null;
        tail = null;
    }


    void insertEnd(int data) {
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    void displayFront(){

        if(head == null){
            System.out.println("list is empty");
        }
        Node1 current = head;
        while(current!= null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    void dislayBack(){
        if(tail == null){
            System.out.println("list is empty");
        }

        Node1 temp = tail;

        while(temp!= null) {
            System.out.print(temp.data + " ");
            temp  = temp.prev;
        }
    }
}
