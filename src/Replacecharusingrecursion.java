public class Replacecharusingrecursion {

    public static String replacechar(String input, char c1,char c2)
    {
        if (input.length()<=1) {
            return input;
        }
        if (input.charAt(0)==c1) {
            return replacechar(input.replace(c1, c2), c1, c2);
            
        }
        return input.charAt(0) + replacechar(input.substring(1), c1, c2);
    }
    public static void main(String[] args) {
        String inpuString = "aaaxbaaxaa";
        char c1 = 'a';
        char c2 = 'c';
        System.out.println(replacechar(inpuString, c1, c2));

        
    }
    
}
