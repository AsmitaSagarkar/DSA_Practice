import java.util.Scanner;

public class Bubblesort {
    static void bubblesort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                }
                
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            a[i] =sc.nextInt();
            
        }
        bubblesort(a);
        System.out.println("Sorted array = ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        sc.close();

        
    }
    
}
