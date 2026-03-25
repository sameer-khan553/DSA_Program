package stack;


// implement stack by using ArrayList ->


import java.util.ArrayList;

import static stack.Stack_05.stack.isEmpty;

public class Stack_05 {

    static class stack {
        static ArrayList<Integer> al = new ArrayList<>();

        public void push(int data) {
            al.add(data);
        }

        public static boolean isEmpty() {
            return al.size() == 0;
        }

        public int peek() {
            return al.get(al.size() - 1);
        }

        public static int pop() {
            int top = al.get(al.size() - 1);
            al.remove(al.size() - 1);
            return top;
        }

        public static int size() {
            return al.size();
        }


    }

    public static void main(String[] args) {

        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);


        while (!isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}