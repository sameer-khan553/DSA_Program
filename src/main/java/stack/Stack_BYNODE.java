package stack;

public class Stack_BYNODE {
    static class Node {
        Node next;
        int data;

        Node top;

        Node(int data) {
            this.data = data;
        }
        
        public void push(int data) {
            Node newNode = new Node(data);
           newNode.next = top;
            top =  newNode;
        }

        public int pop() {

        if(top == null) {
            return -1;
        }
            int val = top.data;
            top = top.next;
          return (val);
        }

        public int peek() {
            return top.data;

        }
    }
}
