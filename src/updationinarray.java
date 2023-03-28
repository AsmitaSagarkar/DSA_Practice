import java.util.Scanner;

public class updationinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int [30];
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        int pos,ele;
        System.out.println("Enter the position you want to update");
        pos =sc.nextInt();
        System.out.println("enter the element now");
        ele = sc.nextInt();
        a[pos-1] = ele;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }


    
}
