import java.util.Scanner;

public class arrayrotation {
    static void rotate(int a[],int d ,int n)
    {
        int temp[] = new int[n];
        int k=0;//keeps the track of the current index
        for (int i = d; i < n; i++) {
            temp[k] = a[i];   //here we are creating a new array temp with index number k which will store the value from d to n-1
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k]=a[i];
            k++;
            
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
            
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(a[i]);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements now");
        for (int i = 0; i < size; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the position you want to rotate from");
        int d= sc.nextInt();
        System.out.println("array before rotation");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("array after rotaion");
        rotate(a, d, size);
        
        sc.close();


    }
    
}
