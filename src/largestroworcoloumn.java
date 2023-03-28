import java.util.Scanner;

public class largestroworcoloumn {
public static int row(int a[][], int rowlen , int collen)
{
    int largest = Integer.MIN_VALUE; 
    //int index = 0;
    for(int i =0;i<rowlen;i++)
    {
        int sum = 0;
        for(int j = 0;j<collen;j++)
        {
            sum= sum+a[i][j];
        }
        if (sum>=largest) {
            largest=sum;
            //index = i ;

            
        }
    }
   // System.out.println(index);

    return largest;
}
public static int col(int a[][] , int rowlen , int collen)
{
    int largest=Integer.MIN_VALUE;
   // int index = 0;
    for (int i = 0; i < collen; i++) {
        int sum = 0;
        for (int j = 0; j < rowlen; j++) {
            sum= sum + a[j][i];
        }
        if (sum>=largest) {
            largest = sum;
           // index = i;

            
        }
        
    }
    //System.out.println(index);
    return largest;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of coloumn");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("enter the element of array now");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
                
            }
            
        }
        int rowsum = row(a, a.length, a[0].length);
        int colsum=col(a, a[0].length,a.length);
        
        if (rowsum>=colsum) {
            System.out.println("row has largest sum");
            System.out.println("largest sum : "+rowsum);
            
        }
        else
        {
            System.out.println("column has largest sum");
            System.out.println("largest sum : "+colsum);
        }


        sc.close();
        
        
    }
    
}
