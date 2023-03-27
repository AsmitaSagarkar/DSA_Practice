import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        String s= new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                
                System.out.println(s.substring(i, j));
                
            }
            
        }
        sc.close();
    }
    
}
