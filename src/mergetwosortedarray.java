import java.util.Scanner;

public class mergetwosortedarray {
    static int[] merge(int a[] , int b[])
    {
        int i = 0;
        int j = 0;
        int k = 0;

        int c[] = new int[a.length+b.length];
        while (i<a.length && j<b.length) {
            if (a[i]<b[j]) 
            {
                c[k] = a[i];
                i++;
                k++;
                
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }

            
        }
        while (i<a.length) {
            c[k] = a[i];
            i++;
            k++;
            
        }
        while(j<b.length)
        {
            c[k] = b[j];
            j++;
            k++;
        }
        
        
        
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int a[] = new int[size1];
        int b[] = new int[size2];

        System.out.println("Now enter the elements of first array");
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Now enter the elements of second array");
        for (int j = 0; j < size2; j++) {
            b[j] = sc.nextInt();
            
        }
        
        System.out.println("Array after merging : ");
        int c[] = merge(a, b);
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k]);
        }
        
        
        
        sc.close();
        
    }
    
}
