package linked_list;

import java.util.Scanner;

public class Palindrome {

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
    public static Node<Integer> reverse(Node<Integer> head){
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
    public static boolean palindrome(Node<Integer> head , Node<Integer> head1){
        boolean value = false;
        if (head == null){
            value = true;
        }

        while (head!=null && head1 !=null){
            if (head.data.equals(head1.data))
            {
                value = true;

            }
            else {
                value = false;
            }
            head = head.next;
            head1 = head1.next;

        }
        return value;

    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> head1 = reverse(head);
        boolean res = palindrome(head,head1);
        System.out.println(res);

    }
}
