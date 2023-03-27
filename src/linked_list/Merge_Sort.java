package linked_list;

import java.util.Scanner;

public class Merge_Sort {
    public static Node<Integer> input(){
        Node<Integer> head = null;
        System.out.println("Enter the data : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data!=-1){
            Node<Integer> NewNode = new Node<>(data);
            if (head==null){
                head = NewNode;

            }
            else{
                Node<Integer> Temp = head;
                while(Temp.next!=null){
                    Temp = Temp.next;

                }
                Temp.next = NewNode;


            }
            System.out.println("Enter the data : ");
            data = sc.nextInt();
        }
        return  head;
    }
    public static Node<Integer> midpoint(Node<Integer> head)
    {
        if (head==null){
            return head;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while(fast.next!=null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static Node<Integer>mergesort(Node<Integer> head)
    {
        if (head == null ||head.next==null)
        {
            return head;

        }

        Node<Integer> midpoint = midpoint(head);
        Node<Integer> h2 = midpoint.next;

        midpoint.next=null;
        Node<Integer> part1 = mergesort(head);
        Node<Integer> part2= mergesort(h2);
        Node<Integer> mergedlist = merge(part1,part2);
        return mergedlist;

    }
//    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
//        if (head1 == null){
//            return head2;
//        }
//        if (head2 == null){
//            return head1;
//        }
//
//        Node <Integer> newHead = null, node1 = head1, node2 =head2, newTail = null;
//        if (node1.data < node2.data){
//            newHead = node1;
//            newTail = node1;
//            node1= node1.next;
//        }else {
//            newHead = node2;
//            newTail = node2;
//            node2= node2.next;
//        }
//
//        while (node1 != null && node2 != null){
//            if (node1.data < node2.data){
//                newTail.next = node1;//jo chota hai uske equal
//                newTail = newTail.next;
//                node1 = node1.next;
//            }else {
//                newTail.next = node2;
//                newTail = newTail.next;
//                node2 = node2.next;
//            }
//        }
//
//        if (node1 == null) {
//            newTail.next = node2;
//        }
//        if (node2 == null) {
//            newTail.next = node1;
//        }
//        return newHead;
//    }

        public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){


        Node<Integer> head3 = null ;
        Node<Integer> tail3 = null;
        if (head1==null)
        {
            head3=head2;
        }
        else if (head2==null){
            head3=head1;
        }
        else if (head1.data<=head2.data){
            head3 = head1;
            tail3 = head1;
            head1 = head1.next;
        }
        else {
            head3 = head2;
            tail3 = head2;
            head2 = head2.next;
        }
        while(head1!=null && head2!=null){
            if (head1.data<=head2.data){
                tail3.next = head1;
                tail3 = tail3.next;
                head1 = head1.next;
            }
            else{
                tail3.next = head2;
                tail3 = tail3.next;
                head2 = head2.next;

            }
        }
        if (head1==null){
            assert tail3 != null;
            tail3.next = head2;
        }
        if (head2==null)
        {

            assert tail3 != null;
            tail3.next = head1;
        }


        return head3;

    }
    public static void print(Node<Integer> head)
    {
        while (head!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> head1= mergesort(head);

        print(head1);


        //System.out.println(midpoint(head));


    }

}
