import java.util.Scanner;

public class tripletsum {
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
                    for (int j2 = j+1; j2 < size; j2++) {
                        
                        if ((a[i]+a[j]+a[j2])==x) {
                            count++;
                            
                            
                        }
                    }
                    
                }
                
            }
            System.out.println("Total count = " + count);

        sc.close();
    }
    
}
