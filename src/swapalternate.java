import java.util.Scanner;

public class swapalternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the aarary");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements now");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Your array");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        for (int i = 0; i < size - 1; i=i+2) {
            int temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp; 
            
        }
        System.out.println("Array after swapping");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        sc.close();
    }
    
}
