import java.util.Arrays;

public class containsduplicate {
    static boolean duplicate(int[] a)
    {
       
        //boolean s = true ;
        //boolean s1 = false;
        Arrays.sort(a);
    
        for (int i = 0; i <a.length-1; i++) 
        {
            
                
                if (a[i]==a[i+1]) 
                {
                    //System.out.println(s);
                    return true;
                }
                
           
        }
        return false;
        
    }
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,10,11,10,11,12,12};
        //int size = a.length;
        System.out.println("Is there any duplicate value in the array?" );
        if (duplicate(a) == true) {
            System.out.println("Yes there are duplicate values in the array!!!!");
            
        }
        else
        {
            System.out.println("There is no duplicate values in the array");
        }
        
    }
    
}
