package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {

    public static int[] stockSpan(int[] stocks){
        int[] span = new int[stocks.length];
        if (stocks.length==0){
            return new int[]{0};
        }
        Stack<Integer> days = new Stack<>();

        days.push(0);
        span[0]=1;

        for (int i = 1; i < stocks.length; i++) {
            while (!days.isEmpty() && stocks[days.peek()]<=stocks[i]){
                days.pop();
            }
            if (days.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = (i-days.peek());

            }
            days.push(i);

        }
        return span;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element now : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(stockSpan(arr)));

    }
}
