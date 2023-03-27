import java.util.Scanner;
public class binarysearch {
    static int binary(int a[], int low , int high,int x)
    {
        if(high>=low)
        {
           int mid = low + (high-low)/2;
           if (a[mid] == x) {
            return mid;
            
           }
            if (a[mid]>x)
           {
            return binary(a, low, mid-1, x);
           }
           else
           {
            return binary(a, mid+1, high, x);
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,8,9,15,16,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to find = ");
        int x = sc.nextInt();
        int result = binary(a, 0, a.length-1, x);
        if (result==-1) {
            System.out.println("Oops element " + x + " is not present");
            
        }
        else
        {
            System.out.println("Element " + x + " is present at = " + (result+1));
        }
        sc.close();
        

    }
    
}
