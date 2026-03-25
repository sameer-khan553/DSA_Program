package stack;


// implement stack by using LinkedList ->

public class Stack_04 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }
       static class stack{
            Node head;

            public  boolean isEmpty(){
                return head == null;
            }

            public void push(int data){
                Node newNode = new Node(data);

                newNode.next = head;
                head = newNode;

            }

            public int pop(){
                if(isEmpty()){
                    throw new RuntimeException("Stack underflow");
                }
                int data = head.data;
                head = head.next;
                return data;
            }

            public int peek(){
                if(isEmpty()){
                    throw new RuntimeException("Stack empty");
                }
                return head.data;
            }

           public static void main(String[] args) {
               stack st  = new stack();
               st.push(1);
               st.push(2);
               st.push(3);


               while(!st.isEmpty()){
                   System.out.print(st.peek()+" ");
                   st.pop();
               }
                   }
        }
    }