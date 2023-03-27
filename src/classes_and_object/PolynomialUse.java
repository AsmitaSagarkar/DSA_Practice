package classes_and_object;

import java.util.Scanner;

public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term in the polynomial = ");
        int n = sc.nextInt();
        System.out.println();
        int[] degree1 = new int[n];
        System.out.println("Enter the power of each degree : ");
        for (int i = 0; i < n ; i++) {
            degree1[i] = sc.nextInt();

        }
        System.out.println("Enter the coefficient respective to each power : ");
        int[] coefficient1 = new int[n];
        for (int i = 0; i < n; i++) {
            coefficient1[i] = sc.nextInt();

        }
        for (int i = 0; i < n ; i++) {
            p1.setCoefficient(degree1[i],coefficient1[i]);

        }
        p1.print();
        // second polynomial
        Polynomial p2 = new Polynomial();

        System.out.print("Enter the number of term in the polynomial = ");
        int n1 = sc.nextInt();
        System.out.println();
        int[] degree2 = new int[n];
        System.out.println("Enter the power of each degree : ");
        for (int i = 0; i < n1 ; i++) {
            degree2[i] = sc.nextInt();

        }
        System.out.println("Enter the coefficient respective to each power : ");
        int[] coefficient2 = new int[n1];
        for (int i = 0; i < n1; i++) {
            coefficient2[i] = sc.nextInt();

        }
        for (int i = 0; i < n1 ; i++) {
            p2.setCoefficient(degree2[i],coefficient2[i]);

        }
        p1.print();

        System.out.println("Enter which operationn you want to perform on polynomial = ");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        int value = sc.nextInt();
        Polynomial result;
        if (value==1)
        {
            result=p1.add(p2);
            result.print();

        }
        if (value==2)
        {
            result=p1.subtract(p2);
            result.print();

        }
        if (value==3)
        {
            result=p1.multiply(p2);
            result.print();

        }






    }

}
