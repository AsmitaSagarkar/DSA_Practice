import java.util.Scanner;


public class multidimensionalarray 
{
    public static void main(String[] args) 
    {
        int [][]a=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the array");
        for (int i = 0; i < a.length; i++) 
        {
            
            for (int j = 0; j < a.length; j++) 
            {
                //System.out.print(a[i][j] + " ");
                a[i][j]=sc.nextInt();
                //System.out.println("\t");
                
                //ssSystem.out.println();
            }
            
        }
        for (int i = 0; i < a.length; i++) 
        {
            //System.out.println();
            
            for (int j = 0; j < a.length; j++) 
            {
                
                System.out.print(a[i][j] +" " );
                
                
            }
            
            
            System.out.println();
        }

        sc.close();
        
    }
}
