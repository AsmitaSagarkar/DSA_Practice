import java.util.Scanner;

public class deletioninarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []a = new int[20];
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the element now");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Array is ....");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        int pos ;
        //System.out.println("Enter the element you want to delete");
        //element =sc.nextInt();
        System.out.println("enter the position  to delete");
        pos = sc.nextInt();
        if (pos<0||pos>size) {
            System.out.println("Invalid position");
            
        } else {
            for (int i = pos-1; i < size-1; i++) {
                a[i]=a[i+1];
                
            }
            size--;
            System.out.println("Array after deletion");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
                
            }

            
        }


        sc.close();
    }
    
}
