import java.util.Scanner;

public class zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber of the testcases");
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            
            System.out.println("Enter the size of the array");
            int size=sc.nextInt();
            int a[]=new int[size];
            
            System.out.println("Enter the elements (only zeros and one)");
            for (int i = 0; i < size; i++) {
                a[i]=sc.nextInt();
                
            }
            System.out.println("Entered elements of the array = ");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
                
            }
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j < size; j++) {
                    if (a[i]>a[j]) {
                        int temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        
                    }
                    
                }
                
            };
            System.out.println("Array after sorting 0's and 1's");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
            }
        }
            
            sc.close();
            
    }
    
}
