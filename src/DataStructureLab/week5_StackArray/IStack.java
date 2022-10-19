package DataStructureLab.week5_StackArray;

public interface IStack<E> {
    //Stack Methods
    public void push(E item);
    public E pop();
    public E top();
    public boolean isEmpty();
    public int size();
}
