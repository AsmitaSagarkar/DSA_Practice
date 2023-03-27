package linked_list;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mid_Point_Use {
    public static Mid_Point<Integer> input() {
        Mid_Point<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();


        System.out.println();

        while (data != -1) {
            Mid_Point<Integer> NewNode = new Mid_Point<>(data);
            if (head == null) {
                head = NewNode;
            } else {
                Mid_Point<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = NewNode;
            }
            System.out.print("Enter the data : ");
            data = sc.nextInt();
            System.out.println();

        }
        return head;
    }

    public static void midpoint()
    {
        Mid_Point<Integer> head = input();
        Mid_Point<Integer> fast = head;
        Mid_Point<Integer> slow = head;

        while(fast.next!=null && fast.next.next!=null){

            slow = slow.next;
            fast = fast.next.next;

        }
        System.out.println(slow.data);




    }



    public static void main(String[] args) {
        //System.out.println(input());
        midpoint();

    }


}
