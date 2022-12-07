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

    public Node insert(Node node, int key) {
        /* 1.  Perform the normal BST insertion */
        if (node == null) {
            return (new Node(key));
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else // Duplicate keys not allowed
        {
            return node;
        }

        /* 2. Update height of this ancestor node */
        node.height = 1 + max(getHeight(node.left),getHeight(node.right));

        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        /* return the (unchanged) node pointer */
        return node;
    }


}
