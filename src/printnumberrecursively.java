import java.util.Scanner;

public class printnumberrecursively {
    public static int number(int n,int m){
        if (m<=n) {
            System.out.println(m + " ");
            return number(n, ++m);
            
        }
        return 1;
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        number(num, 1);

        sc.close();
        
    }
    
}
