package Tree.T3;

import java.util.Scanner;

import static Tree.T3.BinaryTree3.buildTree;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a list of number with separated comma");
        String str = sc.next();

        String [] strArr = str.split( ",");

        Node3 root = buildTree(strArr);

        StringBuilder res=  new StringBuilder();


    }
}
