package stack;

import java.util.Scanner;

public class Stack_02 {


        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class StackUsingLinkedList {
            Node top;

            StackUsingLinkedList() {
                top = null;
            }

            void push(int x) {
                Node newNode = new Node(x);
                newNode.next = top;
                top = newNode;
                System.out.println("Pushed: " + x);
            }

            void pop() {
                if (top == null) {
                    System.out.println("Stack is empty");
                    return;
                }
                System.out.println("Popped: " + top.data);
                top = top.next;
            }

            void peek() {
                if (top == null) {
                    System.out.println("Stack is Empty");
                } else {
                    System.out.println("Top Element: " + top.data);
                }
            }

            void isEmpty() {
                if (top == null) {
                    System.out.println("Stack is Empty");
                } else {
                    System.out.println("Stack is NOT Empty");
                }
            }

            void display() {
                if (top == null) {
                    System.out.println("Stack is Empty");
                    return;
                }

                Node temp = top;
                System.out.print("Stack Elements: ");
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StackUsingLinkedList stack = new StackUsingLinkedList();
            System.out.println("choose an option ");
            while (true) {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        int value = sc.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                    case 4:
                        stack.isEmpty();
                        break;
                    case 5:
                        stack.display();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
}
