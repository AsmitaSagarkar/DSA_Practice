import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        s=sc.nextLine();
        int right  = s.length()-1;
        int left = 0;
        boolean value = true;
        while (left<right) 
        {
            if (s.charAt(left) != s.charAt(right)) {
                value = false;   
            }

            left++;
            right--;
            
        }
        
        System.out.println(value);
        sc.close();
    }
    
}
