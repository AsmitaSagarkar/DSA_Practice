package queue;

public class Array_Main {
    public static void main(String[] args) throws Queue_Underflow_Exception, Queue_Overflow_Exception {
        Queue_Using_Array queue = new Queue_Using_Array(3);
        for (int i = 1; i <=5 ; i++) {
            queue.enqueue(i);

        }
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
