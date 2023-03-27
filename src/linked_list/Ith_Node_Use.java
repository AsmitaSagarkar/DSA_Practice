package linked_list;

import java.util.Scanner;

public class Ith_Node_Use {
    public static Ith_Node<Integer> input() {
        Ith_Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();

        System.out.println();

        while (data != -1) {
            Ith_Node<Integer> NewNode = new Ith_Node<>(data);
            if (head == null) {
                head = NewNode;
            } else {
                Ith_Node<Integer> temp = head;
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

    public static void print(Ith_Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    //function to print ith node
    public static void ith(int pos){
        Ith_Node<Integer> head = input();
        int i=0;
        while(head!=null){
            if (i==pos){
                System.out.println("Node present at "+ i + " : "+head.data);
            }
            i++;
            head = head.next;

        }

    }



    public static void main(String[] args) {
        //Ith_Node<Integer> pos = ith(3);
//        Ith_Node<Integer> head  = input();
//        System.out.println("Linked list : ");
//        print(head);
        System.out.print("Enter the position : ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        ith(pos);

    }
}




