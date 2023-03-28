import java.util.*;

public class adiitionoftwoarray {

    public static void addition(int a[] ,int b[],int c[])
    {
        int size1=a.length;
        int size2 = b.length;
        int size3;
        //int min;
        if (size1>size2) {
            size3 = size1+1;
            
            
        }
        else
        {
            size3 = size2+1;
           
            
        }

        
        int i= size1-1;
        int j = size2-1;
        int k = size3-1;
        int sum=0;
        int carry = 0;

        while(i>=0 &&j>=0)
        {
            sum=a[i]+b[j]+carry;
            c[k] = sum%10;
            
            carry =sum/10;
            i--;
            j--;
            k--;
        }
        while (i>=0) {
            sum=a[i]+carry;
            
            c[k] = sum%10;
            
            carry = sum/10;
            i--;
            k--;
        }
        while (j>=0) {
            sum=b[j]+carry;
            
            c[k] = sum%10;
            
            carry = sum/10;
            k--;
            j--;
        }
        c[0] = carry;
        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        n = sc.nextInt();
        
        
        int a[] = new int[n];
        int b[] = new int[n];
        //int c[] = new int[n];
        System.out.println("Enter the element of first array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Enter the size of second array");
        int m = sc.nextInt();
        System.out.println("Now enter the elements of second array");
        for (int j = 0; j< m; j++) {
            b[j] = sc.nextInt();
            
        }
        System.out.println("elements of first array = ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("Elements of second array = ");
        for (int j = 0; j < m; j++) {
            
            System.out.println(b[j]);
        }

        //adding two arrays
        System.out.println("........................");
        
        int c[] = new int[Math.max(n, m)];
        addition(a, b,c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            
        }
        
        sc.close();
    }
    
}
