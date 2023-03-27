package queue;

public class Queue_Using_Array {
    private int data[];
    private int frontEnd;
    private int rearEnd;
    private int size;

    public Queue_Using_Array(){
        data = new int[10];
        frontEnd = -1;
        rearEnd = -1;
        size = 0;
    }
    public Queue_Using_Array(int capacity){
        data = new int[capacity];
        frontEnd = -1;
        rearEnd = -1;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public int front() throws Queue_Underflow_Exception {
        if (size()==0){
            throw new Queue_Underflow_Exception();
        }
        return data[frontEnd];
    }
    public void enqueue(int element) throws Queue_Overflow_Exception{
        if (size()==data.length)
        {
           // throw new Queue_Overflow_Exception();
            doubleCapacity();

        }
        if (size()==0){
            frontEnd=0;
        }
        rearEnd++;
        size++;
        if (rearEnd==data.length)
        {
            rearEnd=0;
        }
        data[rearEnd] = element;

    }
    public int dequeue() throws Queue_Underflow_Exception{
        if (size()==0){
            throw new Queue_Underflow_Exception();

        }
        int temp = data[frontEnd];
        frontEnd++;
        if (frontEnd== data.length){
            frontEnd=0;
        }
        size--;
        if(size()==0){
            frontEnd=-1;
            rearEnd=-1;
        }
        return temp;
    }
    private void doubleCapacity(){
        int []temp = data;
        data = new int[2* temp.length];
        int index=0;
        for (int i = 0; i <temp.length ; i++) {
            data[index] = temp[i];
            index++;

        }
        for (int i = 0; i <frontEnd-1 ;) {
            data[index] = temp[i];
            index++;

        }
        frontEnd=0;
        rearEnd = temp.length-1;
    }
}
