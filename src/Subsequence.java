public class Subsequence {

    public static String[] subsequence(String input)
    {
        if (input.length() == 0) {
            String ans[] = {""};
            return ans;
            
        }
        String smallans[] = subsequence(input.substring(1));
        String ans[] = new String[2*smallans.length];

        int k = 0;
        for (int i = 0; i < smallans.length; i++) {
            ans[k]=smallans[i];
            k++;
            
        }
        for (int i = 0; i < smallans.length; i++) {
            ans[k]=input.charAt(0) + smallans[i];
            k++;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        String input = "abc";
        String result[] = subsequence(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            
        }

        
    }
    
}
