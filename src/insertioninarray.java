import java.util.Scanner;

public class insertioninarray {
    public static void main(String[] args) {
        int []a = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the element now");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
            
        }
        System.out.println();
        System.out.println("array is ......");
        for (int i = 0; i < size; i++) 
        {
            System.out.println(a[i]);
            
        }
        System.out.println("Enter the element you want to insert into array");
        int x = sc.nextInt();
        System.out.println("Now enter the position you want to insert at");
        int pos = sc.nextInt();
        size++;

        
        for (int i = size; i >=pos-1; i--) {
            a[i]=a[i-1];
            
        }
        a[pos-1]=x;
        System.out.println("Updated array is");

        for ( int i = 0; i <size; i++) {
            System.out.println(a[i]);
            
        }
    



        sc.close();
    }
    
}
