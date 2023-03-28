public class Printallcodes {
    public static void codes(String input)
    {
        String output = "";
        helper(input,output);
        return;
    }
    private static void helper(String input,String output)
    {
        if (input.length()==0) {
            System.out.println(output);
            return;
            
        }
        char char1 = helper1(input.charAt(0)-'0');
        helper(input.substring(1), output+char1);

        if (input.length()>=2) {
            int char2 = input.charAt(0)-'0';
            int char3 = input.charAt(1)-'0';
            int x= char2*10+char3;
            if (x>=10 && x<=26) {
                char ch4 = helper1(x);
                helper(input.substring(2), output+ch4);
                
            }
            
        }
        return;

    }
    private static char helper1(int ch)
    {
        return (char)('a'+ch-1);
    }
    public static void main(String[] args) {
        String input = "1123";
        codes(input);
        
    }
    
}
