package queue;

public class LinkedList_Main {
    public static void main(String[] args) throws Queue_Underflow_Exception {
        Queue_Using_LinkedList<Integer> queue = new Queue_Using_LinkedList<>();

        for (int i = 1; i <=5 ; i++) {
            queue.enqueue(i);

        }
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
