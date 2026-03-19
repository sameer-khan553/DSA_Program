package linkedListProgram.l2;

import linkedListProgram.l1.Node1;

public class LinkedList2 {

    static Node1 head = null;

    public static void addRear(int data){
      Node1 newNode1 = new Node1(data);
      if(head == null){
          head = newNode1;
          return;
      }
      Node1 temp = head;
      while(temp.next != null){
          temp = temp.next;
      }
        temp.next = newNode1;
    }



    static void print(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node1 temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        System.out.println();
    }





    static void addFront(int data){
        Node1 newNode1 = new Node1(data);
        newNode1.next = head;
        head = newNode1;
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

        Node1 newNode1 = new Node1(data);
        Node1 temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        newNode1.next = temp.next;
        temp.next = newNode1;
    }

    static void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    static void deleteRear(){
        Node1 temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
}
