package stack;

public class Stack_Using_LinkedList<T> {
    private Node<T> head;
    private int size;

    public Stack_Using_LinkedList(){
        head = null;
        size=0;
    }

    public int  size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T top() throws Stack_Empty_Exception {
        if (size()==0){
            throw new Stack_Empty_Exception();

        }
        return head.data;

    }
    public void push(T ele){
        Node<T> newNode = new Node<T>(ele);
        newNode.next=head;
        head=newNode;
        size++;

    }
    public T pop() throws Stack_Empty_Exception {
        if (size()==0){
            throw new Stack_Empty_Exception();

        }

        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }

}
