import java.util.Scanner;

public class checknumber {
    public static boolean check(int a[],int x,int startingindex)
    {
          if(a.length == startingindex)
          {
            return false;
          }
          if (a[startingindex] == x) {
            return true;
          }
          return check(a, x, startingindex+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the elements of the array now = ");
        for (int i = 0; i < size; i++) {
            a[i]= sc.nextInt();   
        }
        System.out.println("Enter the element you want to search = ");
        int x= sc.nextInt();
        System.out.println("Is " + x + " present in the array = ");
        System.out.println(check(a, x, 0));

        sc.close();
        
    }
    
}
