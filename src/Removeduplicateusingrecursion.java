public class Removeduplicateusingrecursion {

    public static String remove(String input)
    {
        if (input.length()<=1) {
            
            return input;
            
        }
        
        if (input.charAt(0)==input.charAt(1)) {
            return remove(input.substring(1)) ; 
        }
        return input.charAt(0) + remove(input.substring(1));
        

    }
    public static void main(String[] args) {
        String input = "axxb";
        System.out.println(remove(input));
        
    }
    
}
