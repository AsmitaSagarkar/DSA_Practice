public class Printpermutation {

    private static void print(String input,String output)
    {
        if (input.length()==0) {
            System.out.println(output);
            return;
            
        }
        for (int i = 0; i < input.length(); i++) {
            String string  = input.substring(0,i)+input.substring(i+1,input.length());
            print(string, output+input.charAt(i));
            
        }


    }
    public static void permutation(String input)
    {
        print(input, "");
    }
    public static void main(String[] args) {
        String input = "abc";
        permutation(input);
        
    }
    
}
