import java.util.Scanner;

public class removeconsecutiveduplicate {
    public static String removeConsecutiveDuplicates(String input) {
        String result = "";
		char ch = input.charAt(0);
		result += ch;
		//System.out.println(result);
		for(int i = 1;i < input.length();i++) 
		{
			if(input.charAt(i) == ch);
			else 
				result += input.charAt(i);
			ch = input.charAt(i);
		}
		return result;
	}
    public static void main(String[] args) {
        String s = new String();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string");
        s=sc.next();

        System.out.println(removeConsecutiveDuplicates(s));
        sc.close();

    }
    
}
