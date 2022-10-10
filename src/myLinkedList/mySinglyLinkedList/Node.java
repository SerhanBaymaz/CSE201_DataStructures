package myLinkedList.mySinglyLinkedList;

public class Node {
    //Attributes
    int data;
    Node nextNode;

    //Constructors
    public Node(){}
    public Node(int data){
        this.data=data;
    }

    //Methods
    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
