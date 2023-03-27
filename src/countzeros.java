import java.util.Scanner;

public class countzeros {

    public static int count(int n)
    {
        if (n==0) {
            return 1;
            
        }
        if (n<10) {
            return 0;
            
        }
        if (n%10==0) {
            return 1 + count(n/10);
            
        }
        return count(n/10);
        

       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer = ");
        int n = sc.nextInt();
        System.out.print("Number of zeros in " + n + " = " + count(n));
        

        sc.close();
        
    }
    
}
