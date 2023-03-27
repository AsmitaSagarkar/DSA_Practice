package linked_list;

import java.util.Scanner;

public class Delete_Every_N_Node {

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
    public static  Node<Integer> delete(Node<Integer> head, int m,int n){

        if (head==null){
            return  head;
        }
        if (m==0){
            return null;
        }
        if (n==0){
            return head;
        }
        Node<Integer> temp,curr = head;
        int count;
        while(head!=null){
            for (count=1;count<m&&curr!=null;count++){
                curr = curr.next;

            }
            if (curr==null){
                return head;
            }
            temp=curr.next;
            for (count = 1;count<=n&&temp!=null;count++){
                temp = temp.next;
            }
            curr.next=temp;
            curr=temp;

        }
        return head;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> input = input();
        System.out.print("Enter the value of m : ");
        Scanner sc  =new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Node<Integer> delete = delete(input,m,n);
        print(delete);

    }

}
