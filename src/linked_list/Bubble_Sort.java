package linked_list;

import java.util.Scanner;

public class Bubble_Sort {

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

    public static  Node<Integer> bubbleSort(Node<Integer> head){
        if (head==null || head.next==null){
            return head;
        }
        for (int i = 0; i < length(head); i++) {
            Node<Integer> prev = null,curr=head,next = curr.next;
            while(curr.next!=null){
                if (curr.data>curr.next.data){
                    if (prev==null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }
                    else {
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }

                }
                else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            
        }
        return head;
    }
    private static  int length(Node<Integer> head){
        int count = 1;
        while(head.next!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> head1 = bubbleSort(input());
        print(head1);
    }
}
