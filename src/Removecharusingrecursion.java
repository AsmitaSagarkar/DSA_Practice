import java.util.Scanner;

public class Removecharusingrecursion {
    public static String removechar(String s)
    {
        if (s.length()== 0) {
            return s;   
        }
        String ans = "";
        if (s.charAt(0) != 'x') {
            ans = ans + s.charAt(0); 
        }

        String finalans = removechar(s.substring(1));
        return ans + finalans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        System.out.println(removechar(s));
        sc.close();
        
    }
    
}
