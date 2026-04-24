package stack;

import java.util.Scanner;

public class Stack_Array {
    static class Stack {
        int arr[];
        int top;
        int size;

        Stack(int size) {
            arr = new int[size];
            this.size = size;
            top = -1;
        }

        void push(int x) {
            if(top == size-1) {
                System.out.println("Stack is full");
            }
            else {
                arr[++top] = x;
                System.out.println("pushed: " + x);
            }
        }

        public int pop() {
            if(top == -1) {
                return -1;
            }
            else {
               return arr[top--];
            }
        }

        public int peek() {
            if(top == -1) {
                return -1;
            }
            else {
                return arr[top];
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        void display(){
            for(int i=  top; i>=0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n =  sc.nextInt();
        Stack st = new  Stack(n);
        for(int i =0; i<n; i++){
            st.push(sc.nextInt());
        }

        System.out.println(st.pop());
        System.out.println(st.peek());




    }
}
