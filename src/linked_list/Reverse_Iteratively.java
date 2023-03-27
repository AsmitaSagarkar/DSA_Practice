package linked_list;

import java.util.Scanner;

public class Reverse_Iteratively {


    public static Node<Integer> input(){
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();

        while(data!=-1)
        {
            Node<Integer> NewNode = new Node<>(data);
            if (head==null)
            {
                head = NewNode;
            }
            else {
                Node<Integer> temp = head;
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = NewNode;
            }
            System.out.print("Enter the data : ");
            data= sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> reverseIteratively(Node<Integer> head){
        Node<Integer> CurrentNode = head;
        Node<Integer> PreviousNode = null;
        Node<Integer> Temp;

        while(CurrentNode!=null)
        {
            Temp = CurrentNode.next;
            CurrentNode.next = PreviousNode;
            PreviousNode = CurrentNode;
            CurrentNode = Temp;
        }
        return PreviousNode;

    }
    public static void print(Node<Integer> head){
        while (head!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> head1 = reverseIteratively(head);
        print(head1);
    }
}
