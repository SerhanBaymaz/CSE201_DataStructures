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



    public void delete(int data){
        root = delete(root, data);
    }
    private Node delete(Node currNode, int data){
        if(currNode == null){
            return null;
        }else{
            if(data < currNode.getData()){
                currNode.setLeft(delete(currNode.getLeft(), data));
            }else if(data > currNode.getData()){
                currNode.setRight(delete(currNode.getRight(), data));
            }else{
                if(currNode.getLeft() == null && currNode.getRight() == null){
                    return null;
                }else if(currNode.getLeft() == null){
                    return currNode.getRight();
                }else if(currNode.getRight() == null){
                    return currNode.getLeft();
                }else{
                    Node temp = findMin(currNode.getRight());
                    currNode.setData(temp.getData());
                    currNode.setRight(delete(currNode.getRight(), temp.getData()));
                }
            }
        }
        return currNode;
    }

    public int depth (Node currNode){
        if(currNode == null){
            return 0;
        }else{
            int leftDepth = depth(currNode.getLeft());
            int rightDepth = depth(currNode.getRight());

            if(leftDepth > rightDepth){
                return leftDepth + 1;
            }else{
                return rightDepth + 1;
            }
        }
    }
    public void printDepth(){
        System.out.println("Depth: " + depth(root));
    }

    //Height of a node
    public int height(Node currNode){
        if(currNode == null){
            return 0;
        }else{
            int leftHeight = height(currNode.getLeft());
            int rightHeight = height(currNode.getRight());

            if(leftHeight > rightHeight){
                return leftHeight + 1;
            }else{
                return rightHeight + 1;
            }
        }
    }
    public void printHeight(){
        System.out.println("Height: " + height(root));
    }

    public int countNodes(Node currNode){
        if(currNode == null){
            return 0;
        }else{
            return 1 + countNodes(currNode.getLeft()) + countNodes(currNode.getRight());
        }
    }
    public void printCountNodes(){
        System.out.println("Count Nodes: " + countNodes(root));
    }

    public int countLeaves(Node currNode){
        if(currNode == null){
            return 0;
        }else if(currNode.getLeft() == null && currNode.getRight() == null){
            return 1;
        }else{
            return countLeaves(currNode.getLeft()) + countLeaves(currNode.getRight());
        }
    }
    public void printCountLeaves(){
        System.out.println("Count Leaves: " + countLeaves(root));
    }

    public int countInternalNodes(Node currNode){
        if(currNode == null){
            return 0;
        }else if(currNode.getLeft() == null && currNode.getRight() == null){
            return 0;
        }else{
            return 1 + countInternalNodes(currNode.getLeft()) + countInternalNodes(currNode.getRight());
        }
    }
    public void printCountInternalNodes(){
        System.out.println("Count Internal Nodes: " + countInternalNodes(root));
    }
}
