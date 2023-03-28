import java.util.Scanner;

public class reverseeachword {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        String[] word = s.split(" ");

        for (String string : word) {
            String t = new String(string);

            for (int i = t.length() - 1; i >= 0; i--) {
                System.out.print(t.charAt(i));
                if (i == 0) {
                    System.out.print(" ");
                }

            }

        }

        sc.close();
    }

}
