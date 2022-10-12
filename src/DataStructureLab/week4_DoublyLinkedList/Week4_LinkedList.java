package DataStructureLab.week4_DoublyLinkedList;

public class Week4_LinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.addLast(5);
        myList.addLast(15);
        myList.addLast(27);
        myList.addLast(91);
        myList.print();

    }
}

class LinkedList<E>{
    Node<E> head;
    Node<E> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(E value){
        Node<E> newNode = new Node<E>(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void print(){
        this.print(head);
    }

    private void print(Node<E> node){
        if(node == null)
            return;

        System.out.println(node.getValue());
        print(node.getNext());
    }

}

class Node<E>{
    private E value;
    private Node<E> next;
    private Node<E> previous;

    public Node(E value){
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

}

