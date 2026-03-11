package linkedListProgram;

public class LinkedList2 {

    static Node head = null;

    public static void addRear(int data){
      Node newNode = new Node(data);
      if(head == null){
          head = newNode;
          return;
      }
      Node temp = head;
      while(temp.next != null){
          temp = temp.next;
      }
        temp.next = newNode;
    }



    static void print(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        System.out.println();
    }





    static void addFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }












    static void insertMid(int index, int data){
        if(index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if(index == 0){
           addFront(data);
           return;
        }

        if(head == null) {
            System.out.println(" list is empty");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    static void deleteRear(){
        Node  temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
}
