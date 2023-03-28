import java.util.Scanner;

public class Ascendingorder {
    public static void main(String[] args) {
        int []a = new int [10] ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        System.out.println("Enter the elements in the array now");
        for (int i = 0; i < size; i++) {
            System.out.println("a["+ (i+1) + "] = ");
            a[i]=s.nextInt();   
        }
        System.out.println("Array before arranging");
        for (int i = 0; i < size; i++) {
            System.out.println("a["+ (i+1) + "] = " + a[i]);  
        }
        for (int i = 0; i < size; i++) 
        {
            for (int k = 0; k < size; k++) 
            {
                if(a[i]<a[k])
                {
                    int temp = a[i];
                    a[i]=a[k];
                    a[k] =temp;
                }   
            }
            
        }
        System.out.println("Array in the ascending order");
        
        for (int i = 0; i < size; i++) {
            System.out.println("a["+ (i+1) + "] = " + a[i]);  
        }
        
        s.close();


    }
    
}
