package DataStructureLab.week11_AVLtree;
import static java.lang.Math.max;

public class AVL_Tree {
    Node root;


    public AVL_Tree() {
        root = null;
    }



    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public Node rightRotate(Node node) {
        /*
       node
        / \
       lc   T3
      / \
    T1  rcolc

                    after right rotate
               lc
              / \
            T1  node
                / \
              rcolc   T3

         */
        Node lc = node.left; //get left child
        Node rcolc = lc.right;//get left child's right child

        // Perform rotation
        lc.right = node;
        node.left = rcolc;

        // Update heights
        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        lc.height = max(getHeight(lc.left), getHeight(lc.right)) + 1;

        // Return new root
        return lc;
    }

    public Node leftRotate(Node node) {
        //write example for left rotate to understand
        /*

        node
        / \
      T1  rc
          / \
        lc  T3

                    after left rotate
              rc
              / \
           node  T3
           / \
          T1  lc

         */



        Node rc = node.right; //get right child
        Node lc = rc.left; //get right child's left child

        // Perform rotation
        rc.left = node;
        node.right = lc;

        //  Update heights
        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        rc.height = max(getHeight(rc.left), getHeight(rc.right)) + 1;

        // Return new root
        return rc;
    }

    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }


}
