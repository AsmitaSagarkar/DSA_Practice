package linked_list;

import java.util.Scanner;

public class Delete_Recursively {
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

    public static Node<Integer> delete(Node<Integer> head , int pos){
        if (pos == 0){
            return head.next;
        }
        if (head==null)
        {
            return head;
        }
        head.next = delete(head.next,pos-1);
        return head;
    }
    public static void print(Node<Integer> head) {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head =  input();
        Node<Integer> head1 = delete(head,2);
        print(head1);
    }
}
