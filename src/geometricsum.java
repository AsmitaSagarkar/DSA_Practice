
import java.util.Scanner;

public class geometricsum {
    public static double sum(double n)
    {
        if(n==0)
        {
            return 1 ;
        }
        return  1+(0.5*sum(n-1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        System.out.println("Geometric sum = " + sum(n));
        sc.close();


        
        
    }
    
}
