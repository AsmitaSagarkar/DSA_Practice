import java.util.Scanner;

public class pairsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
            int size=sc.nextInt();
            int a[]=new int[size];
            
            System.out.println("Enter the elements");
            for (int i = 0; i < size; i++) {
                a[i]=sc.nextInt();
                
            }
            System.out.println("Enter the number = ");
            int x = sc.nextInt();
            System.out.println("Entered elements of the array = ");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
                
            }
            int count = 0;
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j < size; j++) {
                    if (a[i]+a[j]==x) {
                        count++;
                        
                        
                    }
                    
                }
                
            }
            System.out.println("Total count = " + count);

        sc.close();
    }
    
}
