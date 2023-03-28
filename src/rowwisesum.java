import java.util.Scanner;
public class rowwisesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of coloumn");
        int cols = sc.nextInt();

        System.out.println("now insert the elements : ");
        int a[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
                
            }
            
        }
        System.out.println("Array = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
                
            }
            
            System.out.println();
        }
        //row wise sum
        
        for (int i = 0; i < row; i++) {
            int sum=0;
            for (int j = 0; j < cols; j++) {
               
                sum= sum+a[i][j];
               
                

                
                
            }
            System.out.print(sum + " ");
            
        }
        sc.close();
    }
    
}
