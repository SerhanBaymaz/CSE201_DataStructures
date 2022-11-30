package DataStructureLab.week10_BinarySearchTree;

public class Node<E> {
    //Attributes
    private E data;
    private Node<E> left;
    private Node<E> right;


    //Constructor
    public Node(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    //Getters and Setters
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }
    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }
    public void setRight(Node<E> right) {
        this.right = right;
    }


    //
}
