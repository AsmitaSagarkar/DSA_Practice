import java.util.Scanner;

public class xtopowern {
    public static int power(int x,int n)
    {
        if (n==0) {
            return 1;
            
        }
        return x*(power(x,n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int n = sc.nextInt();
        int res=power(x, n);
        System.out.println(res);
        sc.close();
        
    }
    
}
