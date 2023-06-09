package array;
import java.util.Arrays;
import java.util.Scanner;
public class Search_2D {
    //linear search
    public static int[] searching(int[][] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                if (array[i][j]==x){
                    return new int[]{i, j};

                }

            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column");
        int column = sc.nextInt();

        int [][]arr = new int[rows][column];
        System.out.println("Enter the elements now : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();


            }

        }

        int[] result = searching(arr,3);
        System.out.println(Arrays.toString(result));



    }
}
