import java.util.Scanner;

public class stringreverse {

    public static void main(String[] args) {
        
        String s=new String();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();

        
        String[] words = s.split(" ");
        String outputstring = "";
        
        for (int i = words.length-1; i >=0; i--) {
            outputstring = outputstring+words[i]+" ";
            
        }
        System.out.print(outputstring);
        sc.close();
    }
    
}
