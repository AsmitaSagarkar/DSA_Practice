package stack;

public class Stack_Using_Array {


    private int[] data;
    private int top ;
    public Stack_Using_Array() {
        data = new int[10];
        top = -1;

    }
    public Stack_Using_Array(int capacity){
        data = new int[capacity];
        top=-1;
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return top+1;
    }

    public int top() throws Stack_Empty_Exception {
        if (size()==0){
            Stack_Empty_Exception e = new Stack_Empty_Exception();
            throw e;
        }
        return data[top];
    }
    private void doubleCapacity(){
        int []temp = data;
        data = new int[2*data.length];
        for (int i = 0; i < top; i++) {
            temp[i] = data[i];

        }
    }
    public void push(int ele) throws Stack_Overflow_Exception {
//        if (size()==data.length)
//        {
//            throw new Stack_Overflow_Exception();
//        }if array is static use this . If array is dynamic then use doubleCapacity function:

        if(size()==data.length){
            doubleCapacity();
        }
        top++;
        data[top] = ele;

    }
    public int pop() throws Stack_Empty_Exception {
        if (size()==0)
        {
            Stack_Empty_Exception e = new Stack_Empty_Exception();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
