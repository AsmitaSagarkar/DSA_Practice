import java.util.Scanner;

public class removex {
    public static String removestring(String input)
    {
        if (input.length()==0) {
            return "";
            
        }
        if (input.charAt(0) == 'x') {
            return removestring(input.substring(1));
            
        }
        else
        {
            return input.charAt(0)+removestring(input.substring(1));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter the new string");
        s= sc.nextLine();
        System.out.print("Final string = " + removestring(s));
        /*//String newstring = s.replace("x", "");
        System.out.println("Final string = " + s.replace("x", ""));*/
        sc.close();
    }
    
}
