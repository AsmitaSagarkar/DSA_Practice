package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Reverse_Queue {

    public static void reverseQueue(Queue<Integer> input){
        if (input.size()==0||input.size()==1){
            return;
        }
        int temp = input.remove();
        reverseQueue(input);
        input.add(temp);
    }
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            queue.add(sc.nextInt());

        }
        reverseQueue(queue);
        System.out.println(queue);





    }
}
