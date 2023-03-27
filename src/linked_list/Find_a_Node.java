package linked_list;

import java.util.Scanner;

public class Find_a_Node {
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
    public static void print(Node<Integer> head) {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int searching(Node<Integer> head , int x)
    {
        int i=0;
        while(head!=null){
            if (x==head.data)
            {
               // System.out.println("yeahhh " + x + " is present at pos " + i + " !!!!!!");
                return i;


            }
            i++;
            head=head.next;
        }
        //System.out.println("opps data is not found.");
        return  -1;




    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data you want to find : ");
        int data = sc.nextInt();

        int res = searching(head,data);
        if (res == -1)
        {
            System.out.println("Opps!!!!! "+ data +  " is not found in the list.");

        }
        else{
            System.out.println("yeahhh " + data + " is present at pos " + (res+1) + " !!!!!!");
        }
    }

}
