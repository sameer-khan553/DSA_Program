package tree;

public class Main {

    public static void main(String[] args) {


        BinaryTree bt = new BinaryTree();

        bt.add(23);
        bt.add(22);
        bt.add(25);

        System.out.println("root :" + bt.root.data);
        System.out.println("root.left: " +bt.root.left.data);
        System.out.println("root.right: " + bt.root.right.data);
    }

}
