import java.util.Scanner;

public class arrangenumberinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of testcases = ");
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            
            System.out.print("Enter the size : ");
            int size = sc.nextInt();
            
            // int a[] =new int[size];
            if (size%2==0) 
            {
                for (int i = 1; i <= size; i=i+2) {
                    System.out.println(i);
                    
                    if (i == size-1) 
                    {
                        for (int j = size; j >0; j = j-2) {
                            System.out.println(j);
                            
                        }
                        
                    }
                    
                }
                
            }
            else
            {
                for (int i = 1; i <= size; i = i + 2) {
                    System.out.println(i);
                    if (i == size) {
                        size = size - 1;
                        for (int j = size; j > 0; j = j - 2) {
                            System.out.println(j);
                            
                        }
                        
                    }
                    
                }
            }
            
        }
            sc.close();
    }

}
