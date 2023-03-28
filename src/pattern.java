
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               // System.out.print("*");
               System.out.print(n);
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               // System.out.print("*");
               System.out.print(i);
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               
               System.out.print(j);
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              
               System.out.print(n-j+1);
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
//triangular pattern
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               // System.out.print("*");
               System.out.print(j);
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        int i =1;
        while (i<=n) {
            int j = 1;
            int startingnumber = i;
            while (j<=i) {
                System.out.print(startingnumber);
                startingnumber++;
                j++;
            }
            System.out.println();
            i++;
        }
           
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        int i = 1;
        int counter = 1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                System.out.print(counter);
                counter++;
                j++;

                
            }
            System.out.println();
            i++;
            
        }
        sc.close();

    }
}*/
//triangle pattern
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(i);
                
                

                
            }
            System.out.println();
           
            
        }
        sc.close();

    }
}*/
//reverse number
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            int startingnumber = i;
            int j = 1;
            while (j<=i) {
                System.out.print(startingnumber);
                startingnumber--;
                j++;
                
            }
            System.out.println();
            i++;
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        //char c;

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(i);
                
                

                
            }
            System.out.println();
           
            
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
               
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
//reverse triangle
/*import java.util.*;

public class pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}*/
//inverted pattern
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
               
               
                
            }
            System.out.println();
            
        }
        sc.close();

    }
}*/
//isosceles pattern
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            
            for (int space = 1; space <= n-i; space++) {

               
               System.out.print(" ");
               
                
            }
            int p=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
                
            }
            p = i-1;
            for (int j = 1; j <= i-1; j++) {
                System.out.print(p);
                p--;
                
            }
            
            System.out.println();
            
            
        }
        sc.close();

    }
}*/
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            
            for (int space = 1; space <= n-i; space++) {

               
               System.out.print(" ");
               
                
            }
            int p=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
                
            }
            p = i-1;
            for (int j = 1; j <= i-1; j++) {
                System.out.print(p);
                p--;
                
            }
            
            System.out.println();
            
            
        }
        sc.close();

    }
}*/
/*import java.util.*;

public class pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(k);

            }
            System.out.println();
        }

        sc.close();

    }
}*/
/*import java.util.*;

public class pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        int k = 1, l  = n-1;
        for (int i = 0; i < n; i++) {
            k= i ;
            for (int j = 0; j <l; j++) {
                System.out.print(" ");
                l--;
                
            }
            for (int j = 1 ; j <= i ; j++ )
        {
            System.out.print(k);
            k++;
        }
        k--;
        k--;
        for (int j = 1 ; j < i ; j++)
        {
            System.out.print(k);
            k--;
        }
        System.out.println();
            
        }
        sc.close();
    }
}*/