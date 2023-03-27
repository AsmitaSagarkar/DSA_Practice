import java.util.Scanner;

public class stringtointeger {
    public static int convert(String input)
    {
        if(input.length()==1)
        {
           return input.charAt(0)-'0';
        }
        int ans = convert(input.substring(1));
        int x = input.charAt(0) - '0';
        x= x*(int)Math.pow(10,input.length()-1)+ans;
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("Enter the new String");
        s=sc.next();
        System.out.println("STRING TO INTEGER = " + convert(s) );
        
        /*System.out.println(Integer.parseInt(s));
        System.out.println(Integer.valueOf(s)); so we can convert string into int using these two methods*/

        

        sc.close();
    }
}
