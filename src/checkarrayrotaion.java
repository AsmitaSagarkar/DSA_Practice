import java.util.Scanner;

public class checkarrayrotaion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements now ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Entered elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i]<min) {
                min = a[i];
                
            }
            
        }
        System.out.println("min = "+min);
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (min == a[i]) {
                index = i;
                if (index == -1) {
                    index = 1;
                    
                }

                
            }

            
        }
        System.out.println("index = " + (index));
         
        sc.close();
    }
    
}
