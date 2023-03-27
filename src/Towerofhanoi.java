import java.util.Scanner;

public class Towerofhanoi {

    public static void Toh(int n , char from, char aux , char to)
    {
        if (n==1) {
            System.out.println(from + " " + to);
            return;
        }
        Toh(n-1, from, to,aux );
        System.out.println(from + " " +  to);
        Toh(n-1, aux, to, from);         
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of disk");
        int n = sc.nextInt();
        //char a = 0 ,b = 0,c = 0;
        Toh(n, 'a', 'b', 'c');
        sc.close();
        
    }
    
}
