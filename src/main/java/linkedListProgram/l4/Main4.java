package linkedListProgram.l4;

public class Main4 {

    Node4 head;

    void insert(int data){
        Node4 newNode = new Node4(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node4 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void print() {
        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


    public int midElement(){
        Node4 temp = head;
        Node4 slow = head;
        Node4 fast = head;
        while(temp.next != null){
            slow = slow.next;
            temp = temp.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
       Main4 main = new Main4();
        main.insert(2);
        main.insert(3);
        main.insert(4);
        main.insert(5);
        main.insert(6);
        main.insert(7);
        main.insert(8);

        main.print();
        System.out.println();
        System.out.println("min element: " +  main.midElement());

    }
}
