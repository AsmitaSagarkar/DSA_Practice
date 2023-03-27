import java.util.Scanner;

public class checksorted {
    public static boolean check(int input[])
    {
        if (input.length <=1) {
            return true;
            
        }
        int smallinput[] = new int[input.length-1];
        for (int index = 1; index < input.length; index++) {
            smallinput[index-1]=input[index];
            
        }
        boolean smallans = check(smallinput);
        if (!smallans) {
            return false;
            
        }
        if (input[0]<=input[1]) {
            return true;
            
        } else {
            return false;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the elements of array now : ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
            
        }
        System.out.println("Entered element in the array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            
        }
        System.out.println("Is this array sorted ? ");
        System.out.println("Ans : " + check(arr));
        sc.close();
        
    }
    
}
