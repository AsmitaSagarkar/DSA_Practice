import java.util.Scanner;

public class sumofarrayrecursively {

    public static int sum(int a[],int size)
    {
        if(size <= 0)
        {
            return 0;
        } 
        return (a[size-1] + sum(a, size-1));
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements of the array now = ");
        for (int i = 0; i < size; i++) {
            a[i]= sc.nextInt();   
        }
        System.out.println("Sum of the array = " + sum(a, size));


        sc.close();


        
    }
    
}
