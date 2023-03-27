import java.util.*;
public class factorial
{

    static int fact(int n)
    {
        if (n == 0 || n==1) {
            return 1;
        }
       return n*fact(n-1);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want to find the factorial of");
        int n=sc.nextInt();
        System.out.println("Factorial of " + n + " is = " + fact(n));

        sc.close();
    }
    
}
