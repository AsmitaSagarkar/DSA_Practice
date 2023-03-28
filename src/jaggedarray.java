import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("enter number you want to increase your column with");
        int col = sc.nextInt();
        int arr[][] = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+col];
            
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                
            }
            System.out.println();
            
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        sc.close();
    }
    
}
