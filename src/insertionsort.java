import java.util.Scanner;

public class insertionsort {
    public static void insertion(int a[])
    {
        for (int i = 1; i < a.length; i++) {
            int j = i-1;
            int temp = a[i];
            while (j>=0 && a[j]>temp) {
                a[j+1] = a[j];
                j--;
                
            }
            a[j+1] = temp;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int a[] =new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();    
        }
        insertion(a);
        System.out.println("Array after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        sc.close();
    }
    
}
