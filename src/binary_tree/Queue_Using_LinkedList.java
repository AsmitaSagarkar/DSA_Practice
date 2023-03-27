package binary_tree;

public class Queue_Using_LinkedList<T> {
    private Node<T> frondEnd;
    private Node<T> rearEnd;
    int size;

    public Queue_Using_LinkedList(){
        //frondEnd=null;
        rearEnd=null;
        size=0;
    }
    int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    T front() throws Queue_Underflow_Exception {

        if (size()==0){
            throw new Queue_Underflow_Exception();
        }
        return frondEnd.data;
    }
    public void enqueue(T ele){
        Node<T> newNode = new Node<>(ele);
        if (rearEnd==null){
            frondEnd=newNode;
            rearEnd = newNode;
        }else {
            rearEnd.next = newNode;
            rearEnd=newNode;
        }
        size++;
    }
    public T dequeue() throws Queue_Underflow_Exception {
        if (size()==0){
            throw new Queue_Underflow_Exception();
        }
        T temp = frondEnd.data;
        frondEnd = frondEnd.next;
        if (size()==0){
            rearEnd = null;
        }
        size--;
        return temp;

    }
}
