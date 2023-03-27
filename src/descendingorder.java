import java.util.Scanner;

public class descendingorder {
    public static void main(String[] args) {
        int a[] = new int[100];
        int size;
        System.out.println("Enter the size of your array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("Enter the elements of the array now");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Your entered elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        //code to arrange elements in descending order
        System.out.println("Given string in descending order are");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                } 
            }
            
        }
        System.out.println("array after sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        
        sc.close();
        

        sc.close();
    }

}
