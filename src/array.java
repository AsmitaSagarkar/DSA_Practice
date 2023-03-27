import java.util.*;
public class array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []a = new int[size];
        System.out.println("Enter the elements now");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
            
        }
        System.out.println("Elements of the array you entered");
        for (int i = 0; i < size; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            
        }
        //to find the largest number in array
        int max=Integer.MIN_VALUE; //here min value is the smallest value array can hold
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max)
            {
                max=a[i];
            }
            
        }
        System.out.println("The largest element in the array is = "+max);
        //to find the smallest element in the array
        int min = Integer.MAX_VALUE;//Max value is the smallest value a array can hold

        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
                
            }
            
        }
        System.out.println("The smallest value in the array = " + min);
        //to find the sum of all elements of the array
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
            
        }
        System.out.println("The sum of the array is = " + sum);
        //reversing an array
        System.out.println("Reversed array is = ");
        for (int i = a.length; i >0; i--) {
            System.out.println(a[i]);
            
        }
        
        sc.close();
        

    }
    
}
