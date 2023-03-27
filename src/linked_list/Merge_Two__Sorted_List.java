package linked_list;

import java.util.Scanner;

public class Merge_Two__Sorted_List {
    public static Node<Integer> input1()
    {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();


        System.out.println();

        while (data != -1) {
            Node<Integer> NewNode = new Node<>(data);
            if (head == null) {
                head = NewNode;
            } else {
                Node<Integer> temp = head;
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
    public static Node<Integer> input2()
    {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();


        System.out.println();

        while (data != -1) {
            Node<Integer> NewNode = new Node<>(data);
            if (head == null) {
                head = NewNode;
            } else {
                Node<Integer> temp = head;
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
    public static Node<Integer> merge(){
        Node<Integer> head1 = input1();
        Node<Integer> head2 = input2();

        Node<Integer> head3 = null ;
        Node<Integer> tail3 = null;
        if (head1==null)
        {
            head3=head2;
        }
        else if (head2==null){
            head3=head1;
        }
        else if (head1.data<=head2.data){
            head3 = head1;
            tail3 = head1;
            head1 = head1.next;
        }
         else {
             head3 = head2;
             tail3 = head2;
             head2 = head2.next;
        }
         while(head1!=null && head2!=null){
             if (head1.data<=head2.data){
                 tail3.next = head1;
                 tail3 = head1;
                 head1 = head1.next;
             }
             else{
                 tail3.next = head2;
                 tail3 = head2;
                 head2 = head2.next;

             }
         }
         if (head1==null){
             assert tail3 != null;
             tail3.next = head2;
         }
         if (head2==null)
         {

             assert tail3 != null;
             tail3.next = head1;
         }


        return head3;

    }
    public static void print(Node<Integer> head)
    {
        while (head!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Node<Integer> head = merge();
        print(head);


    }

}
