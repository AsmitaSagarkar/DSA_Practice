package stack;

import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int []arr = {1,2,3,4,5,};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element pushed : " + stack.push(arr[i]));
            System.out.println();
        }

        System.out.println("Now lets delete from the array : ");
        while (!stack.isEmpty()){
            System.out.print("Element popped : " + stack.pop());
            System.out.println();
        }

    }
}
