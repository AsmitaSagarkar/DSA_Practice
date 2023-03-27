import java.util.*;
public class arrayintersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int a[] = new int[size1];
        int b[] = new int[size2];

        System.out.println("Enter the elements of first array");
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < size2; i++) {
            b[i] = sc.nextInt();    
        }
        System.out.println("Elements of first array = ");
        for (int i = 0; i < size1; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Elements of Second array = ");
        for (int i = 0; i < size2; i++) {
            System.out.println(b[i]);
        }
        System.out.println("ARRAY INTERSECTION : ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (a[i]==b[j]) {
                    System.out.println(a[i]);
                    b[j]= Integer.MIN_VALUE;
                    break;
                    
                }
                
            }
            
        }
        

        


        
        


        sc.close();

    }
    
}
