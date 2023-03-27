import java.util.Scanner;

//class search
//{
    //public int searching(int a[] , int size , int x) {
    //for (int i = 0; i < size; i++) 
    //{
    //    if (x==a[i]) 
    //    {
    //      return i;
    //    }  
    //}
    //return -1;
    
//}
//}
public class linearsearch{
    static int searching(int a[] , int size , int x) {
        for (int i = 0; i < size; i++) 
        {
            if (x==a[i]) 
            {
              return i;
            }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        x=sc.nextInt();

        //search s = new search() ;
        //int r =s.searching(a, a.length, x);
        int r= searching(a, a.length, x);
        if (r == -1)
        {
            System.out.println("Ohhh element " + x + " is not present in the array!!!!!!");   
    }
    else
    {
        System.out.println("Element " + x +" is present at " + (r+1) + " place");
    }
    sc.close();
}
}