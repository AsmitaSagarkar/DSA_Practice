import java.util.Scanner;

public class pushingzerostoback {
    static void swap(int arr[] , int a,int b)
    {
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Now enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();    
        }
        System.out.println("Elements of the array are = ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]!=0) {
            swap(a, j, i);
            j++;
                
            }
            
        }
        System.out.println("Array after swapping = ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        
            
        


        sc.close();
    }
    
}
