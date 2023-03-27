package linked_list;

import java.util.Scanner;
class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;

}
public class K_Reverse {
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
    public static Node<Integer> kReverse(Node<Integer> head,int k){
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        if (k==0){
            return head;
        }
        Node<Integer> h1 = head,h2,t1=head;
        int count =1;
        while(count<k && t1.next!=null){
            t1 = t1.next;
            count++;
        }
        h2 = t1.next;
        t1.next = null;

        DoubleNode ans = reversePart(h1);
        Node<Integer> secondHead = kReverse(h2,k);
        ans.tail.next=secondHead;
        return ans.head;
    }

    private static DoubleNode reversePart(Node<Integer> head){
        if (head==null||head.next==null){
            DoubleNode ans = new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode ans=reversePart(head.next);
        ans.tail.next=head;
        head.next =null;
        ans.tail = ans.tail.next;
        return ans;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> input = input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        Node<Integer> head = kReverse(input,k);
        print(head);
    }
}
