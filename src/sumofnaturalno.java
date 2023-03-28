import java.util.*;
public class sumofnaturalno {
    static int naturalno(int n)
    {
        if (n!=0) {
            return n + naturalno(n-1);
            
        }
        return n;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want to find the sum of");
        int n=sc.nextInt();
        System.out.println("sum = " + naturalno(n));


        sc.close();
    }
}
