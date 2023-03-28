import java.util.Scanner;

public class findunique {
    static int unique(int[] a)//a[] = {2,3,1,6,3,6,2}
    {
        int k = 0;
        boolean []b = new boolean[a.length];
        for (int i = 0; i < a.length; i++) { 
            int x=a[i]; //x=a[0]=2
            if (b[i] == false) { // if value stored in b at index i is false
                boolean isduplicate = false; //initial value of isduplicate is fixed to false
                for (int j = i+1; j < a.length; j++) { 
                    if (x==a[j]) { // x=a[1] = 3
                        isduplicate = true; 
                        b[j] = true; //b[1] = true
                        
                    }
                    
                }
                if (!isduplicate) { //if isduplicate is false
                    k=x; // k = x=a[i]
                    
                }
            }
            
        }
        return k;

    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int a[] = new int[size];
            System.out.println("Enter the elements now = ");
            for (int i = 0; i < size; i++) {
                
                a[i]= sc.nextInt();
            }
            System.out.println("Array you entered = ");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
                
        }
        System.out.println("Unique number in the array = " + unique(a));
        
    }
    sc.close();
        
    }
    
}
