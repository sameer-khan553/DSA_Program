package Tree.T3;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree3 {

    static Node3 root;


    public static  Node3 buildTree(String []arr) {


        if(arr[0] == null) {
            return null;
        }

        Node3 node = new Node3(Integer.parseInt(arr[0]));

        Queue<Node3> queue = new LinkedList<Node3>();

        queue.add(root);


        
        return root;


    }

    public void preOrder() {

    }
}
