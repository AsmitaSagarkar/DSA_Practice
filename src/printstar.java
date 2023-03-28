import java.util.Scanner;

public class printstar {
    public static String pairstar(String input)
    {
        if (input.length()==1) {
            return input;
            
        }
        String addstar = pairstar(input.substring(1));
        if (input.charAt(0)== addstar.charAt(0)) {
            return input.charAt(0) + "*" + addstar;
            
        }
        else{
            return input.charAt(0) + addstar;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String s = sc.next();
        System.out.println();
        System.out.print("FINAL STRING : " + pairstar(s));
        sc.close();
    }
    
}
