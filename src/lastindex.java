import java.util.Scanner;

public class lastindex {
    public static int[] index(int a[] , int x,int firstindex,int fsf)
    {
        if (x==a.length) {
            return new int[fsf];
            
        }
        if (a[firstindex]==x) {
            int iarr[] = index(a, x, firstindex+1, fsf+1);
            iarr[fsf]=firstindex;
            return iarr;  
        }
        else{
            int iarr[] = index(a, x, firstindex+1, fsf);
            return iarr;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements of the array now = ");
        for (int i = 0; i < size; i++) {
            a[i]= sc.nextInt();   
        }
        System.out.println("enter x = ");
        int x = sc.nextInt();
        //System.out.println(index(a, x, 0));
        int iarr[]= index(a, x, 0, 0);
        for (int i = 0; i < iarr.length; i++) {

            if (i == iarr.length-1) {

                System.out.println(iarr[i]);
                
            }
            
        }
        sc.close();
        
    }
    
}
