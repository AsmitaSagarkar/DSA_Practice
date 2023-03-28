import java.util.Scanner;

public class arraysum {
    static int sum(int a[])
    {
        int sum = 0;
            for (int j = 0; j < a.length; j++) {
            sum +=a[j];
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            int a[] =new int[size];
            System.out.println("Enter the elements of the array");
            for (int j = 0; j < size; j++) {
                a[j] = sc.nextInt();
                
            }
            /*int sum = 0;
            for (int j = 0; j < size; j++) {
            sum +=a[j];
            
        }*/
        int res = sum(a);

        System.out.println("Sum = " + res);
    }
            
        

        sc.close();
    }
    
}
