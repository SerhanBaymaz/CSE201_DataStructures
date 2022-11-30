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


    public void inorder(){
        inorder(root);
    }
    private void inorder(Node currNode){
        if(currNode != null){
            inorder(currNode.getLeft());
            System.out.print(currNode.getData() + " ");
            inorder(currNode.getRight());
        }
    }


    public void postorder(){
        postorder(root);
    }
    private void postorder(Node currNode){
        if(currNode != null){
            postorder(currNode.getLeft());
            postorder(currNode.getRight());
            System.out.print(currNode.getData() + " ");
        }
    }




}
