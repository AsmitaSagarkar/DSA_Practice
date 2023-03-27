package linked_list;

import java.util.Scanner;

public class Even_After_Odd {
    public static Node<Integer> input()
    {
        Node<Integer> head = null;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();

        System.out.println();

        while(data!=-1)
        {
            Node<Integer> NewNode = new Node<>(data);
            if (head == null)
            {
                head = NewNode;
            }
            else {
                Node<Integer> temp = head;
                while(temp.next != null)
                {
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
    public static Node<Integer> oddEven(Node<Integer> head){
        Node<Integer> e_start = null;
        Node<Integer> e_end = null;
        Node<Integer> o_start = null;
        Node<Integer> o_end = null;
        while(head!=null){
            if (head.data % 2==0)
            {
                if(e_start == null)
                {
                    e_start = head;
                    e_end = head;

                }
                else{
                    e_end.next = head;
                    e_end = head;

                }

            }
            else{
                if (o_start == null){
                    o_start = head;
                    o_end = head;

                }
                else {
                    o_end.next = head;
                    o_end = head;
                }
            }
            head = head.next;
        }
        o_end.next = e_start;
        e_end.next = null;
        return o_start;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> temp = oddEven(head);
        print(temp);

    }
}
