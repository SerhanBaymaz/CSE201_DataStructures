package DataStructureLab.week5_StackArray;

public class StackArray<E> implements IStack<E> {

    /*
    private static class Node<E> {
        //attributes


        //Constructor


        //Methods

    }
    */

    //Stack Attributes
    //private Node<E> top;
    private E[] data;
    private int size;

    //Stack Constructor
    public StackArray() {
        //top = null;
        data = (E[]) new Object[1000];
    }



    //Stack Methods

    /*
    1. push() : This push() operation place the element at the top of the stack.


    2. peek() : The element retrieved does not get deleted or removed from the Stack.

    3. pop()  : The element is popped from the top of the stack and is removed.
     */

    @Override
    public void push(E item) {
        data[size++] = item;
    }

    @Override
    public E pop() {
        E temp = data[size - 1];
        data[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public E top() {
        return data[size - 1];
    }

    @Override
    public boolean isEmpty() {
           return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    //To string
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s += data[i] + ", ";
        }
        return "[" + s + "]";
    }


    public static void main(String[] args) {
        System.out.println("************************");

        StackArray<Integer> stack = new StackArray<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack Top: " + stack.top());
        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack: " + stack);

        System.out.println("************************");
    }
}
