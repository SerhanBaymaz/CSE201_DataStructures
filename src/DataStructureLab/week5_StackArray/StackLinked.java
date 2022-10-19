package DataStructureLab.week5_StackArray;

public class StackLinked<E> implements IStack<E>{

    private static class Node<E> {
        //attributes
        private E data;
        private Node<E> next;

        //Constructor
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }


    }


    //Stack Attributes

    private Node<E> top;
    private int size;

    //Stack Constructor
    public StackLinked() {
        top = null;
        size = 0;
    }

    //Stack Methods


    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        size++;
    }

    @Override
    public E pop() {
        E temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    @Override
    public E top() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StackLinked [");
        Node<E> temp = top;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
            if (temp != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }



    public static void main(String[] args) {
        StackLinked<Integer> stack = new StackLinked<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);






    }
}
