package Tree.T1;

public class BinaryTree {

    Node root;
    public Node insert(Node root, int data) {
    if(root == null)
        return new Node(data);

    if(data < root.data)
        root.left = insert(root.left ,data);

    else
        root.right = insert(root.right, data);

    return root;

    }

    public void add(int data) {
        root = insert(root,data);
    }
    }

