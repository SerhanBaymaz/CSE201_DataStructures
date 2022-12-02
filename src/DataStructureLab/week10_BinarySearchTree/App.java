package DataStructureLab.week10_BinarySearchTree;

public class App {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(10);
        bst.root.setLeft(new Node(5));
        bst.root.setRight(new Node(15));
        bst.root.getLeft().setLeft(new Node(2));
        bst.root.getLeft().setRight(new Node(7));
        bst.root.getRight().setLeft(new Node(12));
        bst.root.getRight().setRight(new Node(17));
        bst.root.getLeft().getLeft().setLeft(new Node(1));
        bst.root.getLeft().getLeft().setRight(new Node(3));

        System.out.println("Preorder: ");
        bst.preorder();
        System.out.println();

        System.out.println("Inorder: ");
        bst.inorder();
        System.out.println();

        System.out.println("Postorder: ");
        bst.postorder();
        System.out.println();

        System.out.println("********");

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(10);
        bst2.insert(5);
        bst2.insert(15);
        bst2.insert(2);
        bst2.insert(7);
        bst2.insert(12);
        bst2.insert(17);
        bst2.insert(1);
        bst2.insert(3);
        bst2.insert(20);
        bst2.insert(18);
        bst2.insert(19);
        bst2.insert(16);
        bst2.insert(14);
        bst2.insert(13);
        bst2.insert(11);
        bst2.insert(9);

        System.out.println("Preorder: ");
        bst2.preorder();
        System.out.println();

        System.out.println("Depth of the tree is :" + bst2.depth(bst2.root));


    }
}
