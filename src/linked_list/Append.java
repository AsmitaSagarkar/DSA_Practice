package linked_list;

import java.util.Scanner;

public class Append {


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
    public static Node<Integer> head(Node<Integer> head)
    {
        return head;
    }


    public static Node<Integer> append(Node<Integer> head,Node<Integer>head1){
        Node<Integer> temp=null;
        //Node<Integer> temp1=head1;
        if (head.next == null){
            return head;

        }
        while(head!=null){
            if (head.next.next==null)
            {
                temp=head.next;
                head.next = null;
                temp.next = head1;

            }
            head=head.next;
        }
        return temp;

    }
    public static void print(Node<Integer> head){
            while(head!=null){
                System.out.print(head.data + " ");
                head=head.next;
            }
        System.out.println();
    }

    public static void main(String[] args) {
            Node<Integer> head= input();
            Node<Integer> head1 = head(head);
            Node<Integer> head2 = append(head,head1);
            print(head2);

    }
}
