package searching_and_sorting;

import java.util.Scanner;

public class LinearSearch {

    static int searching(int[] a, int size , int x) {
        //int i=0;
        for (int i = 0; i < size; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        x = sc.nextInt();

        int r = searching(a, a.length, x);
        if (r == -1) {
            System.out.println("Ohhh element " + x + " is not present in the array!!!!!!");
        } else {
            System.out.println("Element " + x + " is present at " + (r + 1) + " place");
        }
    }
}
