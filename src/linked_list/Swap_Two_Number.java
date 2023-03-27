package linked_list;

import java.util.Scanner;

public class Swap_Two_Number {

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
    public static Node<Integer> swapNumber(Node<Integer> head, int i,int j){
        Node<Integer> temp = head,c1=null,c2=null,p1=null,p2=null,prev=null;
        int pos = 0;

        while(temp!=null){
            if (pos==i){
                p1 = prev;
                c1=temp;
            } else if (pos==j) {
                p2=prev;
                c2=temp;

            }
            prev=temp;
            temp=temp.next;
            pos++;
        }
        if (p1!=null){
            p1.next=c2;
        }
        else {
            head=c2;
        }
        if (p2!=null){
            p2.next =c1;
        }
        else {
            head=c1;
        }
        Node<Integer> temp1 = c2.next;
        c2.next = c1.next;
        c1.next = temp1;
        return head;


    }


    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> input = input();
        System.out.print("Enter the value of i : ");
        Scanner sc  =new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Enter the value of j : ");
        int j = sc.nextInt();
        Node<Integer> delete = swapNumber(input,i,j);
        print(delete);
    }

}
