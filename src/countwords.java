import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                 count++;  
            }
            
        }
        System.out.println("TOTAL NUMBER OF WORDS : " + (count+1));
        sc.close();
    }
    
}
