import java.util.Scanner;

public class palidromeusingrecursion {
    public static boolean palidrome(String s)
    {
       if (s.length()<=1) {
        return true;
        
       }
       if (s.charAt(0)!=s.charAt(s.length()-1)) {
        return false;
        
       }
       return palidrome(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        System.out.println(palidrome(s));
        sc.close();
        
    }
    
}
