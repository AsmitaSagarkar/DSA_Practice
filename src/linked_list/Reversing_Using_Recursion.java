package linked_list;

import java.util.Scanner;
class Double_Node {
    Node<Integer> head;
    Node<Integer> tail;
}
public class Reversing_Using_Recursion {
    public static Node<Integer> input(){
        Node<Integer> head = null;
        System.out.print("Enter the data : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data!=-1){
            Node<Integer> NewNode = new Node<>(data) ;
            if (head==null)
            {
                head = NewNode;
            }
            else {
                Node<Integer> temp = head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next = NewNode;
            }
            System.out.print("Enter the data : ");
            data = sc.nextInt();
        }
        return  head;
    }
    public static Node<Integer> reverse(Node<Integer> head){
        if (head==null || head.next==null){
            return head;
        }
        Node<Integer> finalhead = reverse(head.next);
        Node<Integer> temp = finalhead;
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.next = head;
        head.next = null;
        return finalhead;

    }//time complexity  == O(n^2)

    //so we are using another approach where time complexity is O(n) which is far better than the first approach for this we are creating a class called double node


    public static Double_Node reverselinkedlist(Node<Integer> head){
        if (head==null || head.next==null)
        {
            Double_Node ans = new Double_Node();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        Double_Node smallAns = reverselinkedlist(head.next);
        smallAns.tail.next = head;
        head.next = null;

        Double_Node ans = new Double_Node();
        ans.head = smallAns.head;
        ans.tail = head;

        return ans;



    }
    public static void print(Node<Integer> head)
    {
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }


    public static void main(String[] args) {
        System.out.println("For time complexity: O(n^2)");
        Node<Integer> head = input();
        Node<Integer> head1 = reverse(head);
        print(head1);

        System.out.println("__________________________________________________________________________________________");
        System.out.println("For time complexity : O(n)");
        Node<Integer> newhead = input();
        Double_Node newhead1 = reverselinkedlist(newhead);
        print(newhead1.head);


    }
}
