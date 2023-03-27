package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String[] args) {
        //queue is an interface.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.poll());
    }
}
