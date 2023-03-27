package linked_list;

import java.util.Scanner;

public class Remove_Duplicate {

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
    public static Node<Integer> removeDuplicate(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> next = head.next;
        Node<Integer> temp=head;

        if (head==null){
            return head;
        }
        if (head.next == null){
            return head;
        }
        while(next!=null){
            if (curr.data.equals(next.data)){
                next = next.next;
            }
            else {
                curr.next = next;
                curr = next;
            }
        }
        curr.next = null;
        return temp;

    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> temp= removeDuplicate(head);
        print(temp);
    }
}
