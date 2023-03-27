import java.util.Scanner;
public class numberofdigits {
    static int c=0;
    public static int count(int n)
    {
        if(n>0) {
            c++;
            count(n/10);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int res = count(num);
        System.out.println(res);
        sc.close();

        
    }
    
}
