package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_Stack {

//    public static void reverseStack(Stack<Integer> input , Stack<Integer> extra)
//    {
//        if (input.size()<=1)
//        {
//            return;
//        }
//        int temp = input.pop();
//        reverseStack(input, extra);
//        while(!input.isEmpty()){
//            int z= input.pop();
//            extra.push(z);
//        }
//        while(!extra.isEmpty()){
//            int k = extra.pop();
//            input.push(k);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your stack");
        int size = sc.nextInt();
        //int input = 0;
        Stack<Integer> stack = new Stack<>();
        //Stack<Integer> extra = new Stack<>();
        System.out.println("enter the element you want to push : ");
        int a[] = new int[size];

//        Stack<Integer> input = new Stack<>();
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < size; i++) {
            stack.push(a[i]);

        }

        int []reverse = new int[size];

        for (int i = 0; i < size ; i++) {
            reverse[i] = stack.pop();

        }
        System.out.println(Arrays.toString(reverse));
//        //System.out.println(reverseStack(stack,extra));
//        for (int i = 0; i < size; i++) {
//            reverseStack(stack,extra);
//        }
//        while (!extra.isEmpty())
//            System.out.println(extra);




    }

}
