public class Returnpermutation {

    public static String[] permutation(String input)
    {
        if (input.length()==0) {
            String ans1[] = {""};
            return ans1;
            
        }
        String [] ans = permutation(input.substring(1));
        String output[] = new String[ans.length*input.length()];

        int k = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <= ans[i].length(); j++) {
                output[k++] = ans[i].substring(0,j)+input.charAt(0)+ans[i].substring(j);
                
            }
            
        }
        return output;
    }
    public static void main(String[] args) {
        String input = "abc";
        String result[] = permutation(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            
        }
        //System.out.println(result);
        
    }
    
}
