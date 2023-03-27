import java.util.Scanner;

public class allindex {
    
    public static int[] index(int arr[],int x,int currentindex,int fsf)
    {
        if (currentindex==arr.length) {
            return new int[fsf]; 
            
        }
        if (arr[currentindex]==x) {
            int iarr[] = index(arr, x, currentindex+1, fsf+1);
            iarr[fsf] = currentindex;
            return iarr;
        }
        else
        {
            int iarr[] = index(arr, x, currentindex+1, fsf);
            return iarr;
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements of the array now = ");
        for (int i = 0; i < size; i++) {
            a[i]= sc.nextInt();   
        }
        System.out.println("enter x = ");
        int x = sc.nextInt();

        System.out.println("indices = ");

        int iarr[] = index(a, x, 0, 0);
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
            
        }
        
        
        sc.close();
        
    }
    
}
