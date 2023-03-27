import java.util.Scanner;

public class printlikeawave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        int a[][] = new int[row][col];

        System.out.println("Enter the elements of array now");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
                
            }
            
        }
        System.out.println("Array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        for (int i = 0; i < a[0].length; i++) {
            if (i%2==0) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[j][i]+" ");
                    
                }
                
            }
            else if (i%2!=0) {
                for (int j = a.length-1; j >=0; j--) {
                    System.out.print(a[j][i]+" ");
                    
                }
                
            }
            
        }
        sc.close();
    }
    
}
