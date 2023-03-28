import java.util.Scanner;


public class replacepi {

    public static String replace(String input)
    {
        if (input.length()==0 || input.length() == 1) {
            return input;
            
        }
        String smallstring = replace(input.substring(1));
        if (smallstring.charAt(0)== 'i' && input.charAt(0)== 'p') {
            smallstring="3.14" + smallstring.substring(1);
            
        }
        else
        {
            smallstring = input.charAt(0) + smallstring;
        }
        return smallstring;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s=sc.nextLine();
        System.out.println();
        System.out.print("String after replacement = " + replace(s));

            
        
        sc.close();

    }
    
}
