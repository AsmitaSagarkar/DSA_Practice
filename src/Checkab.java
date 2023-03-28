public class Checkab {
    public static boolean check(String input)
    {
        boolean ans = false;
        if (input.length() == 0) {
            ans = true;
            
        }
       /*  if (input.charAt(0) == 'a' && input.length() == 1) {
            ans = true;
            //return check(input.substring(1));
            
        }*/
        if (input.length()>1) {
            if (input.charAt(0) == 'a' && input.substring(1, 3).equals("bb")) {
                return check(input.substring(3));
                
            }
            else
            {
                return check(input.substring(1));
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abababag";
        System.out.println(check(s));
        
    }
    
}
