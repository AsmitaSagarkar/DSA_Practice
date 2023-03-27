import java.util.*;
public class fibonacci {
    static int fib(int n)
    {
        if (n==0) {
            return 0;
            
        }
        if (n==1||n==2) {
            return 1;
            
        }
        return  (fib(n-1) + fib(n-2));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want to find the fibonacci series of");
        int n=sc.nextInt();
        System.out.println("Fibonacci series of " + n + " is = ");
        for(int i = 0;i<n;i++)
        {
        System.out.print(fib(i));
        if(i<n-1) {
            System.out.print(",");
            
        }
        }
        System.out.println();
        System.out.println(n + "th fibonacci number is : " + fib(n));

        sc.close();
    }
    
}
