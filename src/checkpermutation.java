import java.util.Scanner;

public class checkpermutation {
    public static void main(String[] args) {
        String s = new String();
        String t = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        s=sc.next();
        System.out.println("Enter string 2 : ");
        t=sc.next();
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    f= true;
                    
                } else {
                    f=false;
                    
                }
                
            }
            
        }
        System.out.println(f);


        sc.close();
        

    }
    
}
