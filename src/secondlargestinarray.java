import java.util.Scanner;

public class secondlargestinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of teh array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
            
        }
        System.out.println();
        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        //sorting an array in descending order
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                }
                
            }
            
        }
        System.out.println("sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("second largest element is = " + a[1]);
        
        sc.close();

    }
    
}
