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



    public void insert(int data){
        root = insert(root, data);
    }
    private Node insert(Node currNode, int data){
        if(currNode == null){
            currNode = new Node(data);
            return currNode;
        }else{
            if(data < currNode.getData()){
                currNode.setLeft(insert(currNode.getLeft(), data));
            }else{
                currNode.setRight(insert(currNode.getRight(), data));
            }
        }
        return currNode;
    }



    public Node findMax(Node currNode){
        if(currNode.getRight() == null){
            return currNode;
        }else{
            return findMax(currNode.getRight());
        }
    }
    public Node findMin(Node currNode){
        if(currNode.getLeft() == null){
            return currNode;
        }else{
            return findMin(currNode.getLeft());
        }
    }





}
