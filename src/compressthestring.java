import java.util.Scanner;
public class compressthestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();

        System.out.println("Enter the string");
        s=sc.nextLine();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int count=1;
            while (i<len-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
                i++;

                
            }
            if (count==1) {
                System.out.print(s.charAt(i)+"1");
                
            } else {
                System.out.print(s.charAt(i));
                System.out.print(count);
                
            }
            
        }
        sc.close();
    }
    
}
