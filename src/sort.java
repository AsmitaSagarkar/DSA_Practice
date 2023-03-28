import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter 0's,1's and 2's");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Original array");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("Array after sorting : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                }
                
            }
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        sc.close();
    }
    
}
