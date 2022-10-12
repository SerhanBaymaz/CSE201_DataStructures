package DataStructureLab.week4_DoublyLinkedList;

public class Week4_LinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.addLast(5);
        myList.addLast(15);
        myList.addLast(27);
        myList.addLast(91);
        myList.print();

        System.out.println("***********");
        myList.addFirst(2);
        myList.print();

        System.out.println("***********");
        System.out.println("my value is : "+myList.getNode(0).getValue());

        System.out.println("***********");
        myList.insertAfter(1,10000);
        myList.print();
        System.out.println("***********");


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
            newNode.setPrevious(tail);

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

    public void printReverse(Node<E> node){
        if(node == null)
            return;

        System.out.println(node.getValue());
        printReverse(node.getPrevious());
    }

    public void printReverse(){
        this.printReverse(tail);
    }

    public void addFirst(E value){
        Node<E> newNode = new Node<E>(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    public Node<E> getNode(int index) {
        if (index < 0 || isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<E> temp = head;
        for (int i = 0; i < index+1; i++) {
            if (counter == index) {
                return temp;
            }

            temp = temp.getNext();
            counter++;

            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        return null;

    }

    public void insertAfter(int index, E value){
        Node<E> prevNode = getNode(index);
        Node<E> nextNode = prevNode.getNext();
        Node<E> newNode = new Node<E>(value);


        if (prevNode==null){
            throw new IndexOutOfBoundsException();
        }
        else if (nextNode==null){
            addLast(value);
        }
        else{
            prevNode.setNext(newNode);
            newNode.setPrevious(prevNode);
            newNode.setNext(nextNode);
            nextNode.setPrevious(newNode);
        }


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

