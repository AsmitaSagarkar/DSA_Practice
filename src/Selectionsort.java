import java.util.Scanner;

public class Selectionsort {

    static void selectionsort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minindex = i;
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[j] < min) {
                    min = a[j];
                    minindex = j;

                }

            }
            if(minindex!=i)
            {

                a[minindex] = a[i];
                a[i] = min;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array now");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();

            
        }
        selectionsort(a);
        System.out.println("Swapped array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            
        }

        sc.close();

    }

}
