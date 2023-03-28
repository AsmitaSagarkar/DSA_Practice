import java.util.Scanner;

public class removecharacter {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        System.out.println("Enter the charater you want to remove");
        String a= sc.nextLine();
        

        System.out.println(s.replace(a, ""));
        sc.close();
    }
    
}
