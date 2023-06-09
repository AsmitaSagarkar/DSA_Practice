import java.util.Scanner;

public class subarray {
    static void sub(int a[])
    {
        //int product = 1,sum=0;
        for (int start = 0; start < a.length; start++) {
            for (int grps = start; grps <= a.length; grps++) {
                for (int i = start; i < grps; i++) {
                    System.out.print(a[i]);
                    //element  = a[i];
                    
                }
                //product = product*element;
                System.out.println();
                
            }
            
            //sum = sum + product;
        }
        //System.out.println("sum = " + sum);
        
    }
    public static void main(String[] args) {
        //int a[] = {1,2,3};
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[]  = new int[n] ;
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        sub(a);
        sc.close();
        
    }
    
}



