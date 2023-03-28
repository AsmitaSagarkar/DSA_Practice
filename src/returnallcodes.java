public class returnallcodes {


    public static String[] codes(String input)
    {
        if (input.length()==0) {
            String ans[] = {""};
            return ans;
            
        }

        String smallans[] = codes(input.substring(1));

        int an = input.charAt(0)-'0';
        char firstchar = (char)('a' + an-1);

        for (int i = 0; i < smallans.length; i++) {
            smallans[i] = firstchar+smallans[i];
            
        }
        
        String smallans1[] = new String[0];
        if (input.length()>=2) {

            int char1 = input.charAt(0) - '0';
            int char2 = input.charAt(1)-'0';

            int an3 = (char1*10)+char2;

            if (an3>=10 && an3<=26) {
                char ftc = (char)('a'+an3-1);
                smallans1 = codes(input.substring(2));

                for (int i = 0; i < smallans1.length; i++) {
                    smallans1[i] = ftc+smallans1[i];
                    
                }
                
            }
            
        }
        String output[] = new String[smallans.length+smallans1.length];
        int k=0;

        for (int i = 0; i < smallans.length; i++) {
            output[k] = smallans[i];
            k++;
            
        }
        for (int i = 0; i < smallans1.length; i++) {
            output[k] = smallans1[i];
            k++;
            
        }
        return output;




    }
    public static void main(String[] args) {

        String input = "1123";
        String output[] = codes(input);
        for (int i = 0; i < output.length ; i++) {
            System.out.println(output[i]);
            
        }
        
        
    }
    
}
