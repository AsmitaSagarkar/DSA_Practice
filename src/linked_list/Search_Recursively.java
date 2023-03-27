package linked_list;

import java.util.Scanner;

public class Search_Recursively {
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

    public static int search(Node<Integer> head , int data,int index)
    {
        if (head==null){
            return -1;
        }
        if (head.data == data){
            return index;

        }

            int ans;
            ans = search(head.next, data, index+1);
            return ans;

        //return value;
    }

    public static void main(String[] args) {
        System.out.print("Enter the data you want to find : ");
        Scanner sc  = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> input = input();
        int res = search(input,data,0);
        if (res == -1){
            System.out.println("oops element is not present!!!");
        }
        else {
            System.out.println("element " +data +" is present at " + res);
        }
    }
}
