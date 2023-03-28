import java.util.Scanner;

public class multiplication {
    public static int multi(int n,int m)
    {
        if (n==0 || m==0) {
            return 0;
            
        }
        return n + multi(n, --m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of two integer :");
        System.out.print("Integer 1 : ");
        int n = sc.nextInt();
        System.out.print("Integer 2 : ");
        int m = sc.nextInt();
        System.out.println();
        System.out.print("The product of two integer is : " + multi(n, m));
        sc.close();

        
    }
    
}
