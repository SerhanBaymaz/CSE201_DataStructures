package DataStructureLab;

class Node<E>{
    //Attributes
    private E value;
    private Node<E> next;

    //Constructor
    public Node(E value){
        this.value=value;
    }

    //Getter and Setters
    public E getValue() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }



}

class LinkedList<E>{
    private Node<E> head;
    private Node<E> tail;

    public boolean isEmpty(){
        return head == null;
    }
}



public class Week3_LinkedList {

    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

    }
}
