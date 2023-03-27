import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        int arr[][]=new int[rows][col];
        System.out.println("Enter the elements now");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println("your array is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
            
        }
        int num=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i==0) {
                    for (int j2 = 0; j2 < col; j2++) {
                        num = arr[i][j];
                        
                    }
                    
                    System.out.print(num);
                }
                if (j==col-1) {
                    for (int j2 = 0 ; j2 < rows; j2++) {
                        num=arr[i][j];
                        
                    }
                    System.out.print(num);
                    
                }
                
            }
            
        }
        int sum1=0;
        for (int i = rows-1; i >= 0; i--) {
            for (int j = col-1; j >= 0; j--) {
                if (i==rows-1) {
                    for (int j2 = col-1; j2 >0; j2--) {
                        sum1=arr[i][j];
                        
                    }
                    System.out.print(sum1);
                    
                }
                if (j==0) {
                    for (int j2 = rows-1; j2 >1; j2--) {
                        sum1 = arr[i][j];
                        
                    }
                    System.out.print(sum1);
                    
                }

                
            }
            
        }
        System.out.println(arr[1][1]);
        /*for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[1][1]);
                
            }
            
        }*/
        sc.close();
    }
    
}
