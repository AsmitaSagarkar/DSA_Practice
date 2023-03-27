package linked_list;

import java.util.Scanner;

public class Insert_Recursively {
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

    public static Node<Integer> insert(Node<Integer> head,int pos ,int data){
        if (pos==0){
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            return newNode;
        }
        if (head==null){
            return head;
        }
        head.next = insert(head.next,pos-1,data);
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
        Node<Integer> head1 = insert(head,3,2);
        print(head1);
    }
}
