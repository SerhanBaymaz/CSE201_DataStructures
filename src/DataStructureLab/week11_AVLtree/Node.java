package DataStructureLab.week11_AVLtree;

public class Node {
    public int key;
    public int height;
    public Node left;
    public Node right;


    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
        this.height = 1;
    }


}
