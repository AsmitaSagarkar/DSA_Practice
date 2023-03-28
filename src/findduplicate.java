import java.util.*;
public class findduplicate {
    static int duplicate(int []a)
    {
        int count =0;
        int k=0;

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            if(count == 0)
            {
                for (int j = i+1; j < a.length; j++) {
                    if (temp == a[j]) {
                        count=1;
                        k=a[i];
                        break;
                        
                    }
                    
                }
            }
            
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases = ");
        int t = sc.nextInt();
        for(int k = 0;k<t;k++)
        {

            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int a[] = new int[size];
            
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
                
            }
            System.out.println("Your entered array is : ");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
            }
            System.out.println("The duplicate value in the array is = " + duplicate(a));
            
            
        }
            sc.close();
        }
    
}


