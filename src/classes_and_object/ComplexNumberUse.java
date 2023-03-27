package classes_and_object;

import java.util.Scanner;

public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumber c= new ComplexNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice: ");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for multiplication");
        int value = sc.nextInt();
        c.setReal(4);
        c.setImaginary(5);
        c.print();
        if (value==1) {

            ComplexNumber c1 = new ComplexNumber();
            c1.setReal(100);
            c1.setImaginary(200);
            c1.print();
            c.plus(c1);
            c.printplus();
        }if (value==2) {
            ComplexNumber c2 = new ComplexNumber();
            c2.setReal(6);
            c2.setImaginary(7);
            c2.print();
            c.multiply(c2);
            c.printmultiply();
        }





    }
}
