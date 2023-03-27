import java.util.Scanner;

public class firstindex {

    public static int index(int a[] , int x,int startingindex) {
        if (a[startingindex] == x) {
            return startingindex;   
        }
        if(a.length == startingindex){
            return -1;
        }
        return index(a, x, startingindex+1);

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements of the array now = ");
        for (int i = 0; i < size; i++) {
            a[i]= sc.nextInt();   
        }
        System.out.println("enter x = ");
        int x = sc.nextInt();
        System.out.println(index(a, x, 0));
        sc.close();
        
    }
    
}
