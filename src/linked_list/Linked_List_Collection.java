package linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List_Collection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your list : ");
        int size = sc.nextInt();
        System.out.println();
        System.out.println("Enter the values now : ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());

        }
        System.out.println("Your list is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");

        }
        list.set(4,3);
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
