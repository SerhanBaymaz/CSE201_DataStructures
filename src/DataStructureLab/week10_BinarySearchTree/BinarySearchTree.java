package DataStructureLab.week10_BinarySearchTree;

public class BinarySearchTree {
    //Attributes
    public Node root;

    //Constructor
    public BinarySearchTree() {
        this.root = null;
    }

    //Methods
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node currNode){
        if(currNode != null){
            System.out.print(currNode.getData() + " ");
            preorder(currNode.getLeft());
            preorder(currNode.getRight());
        }
    }




}
