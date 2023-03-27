package linked_list;
 import java.util.Scanner;

public class MergeSortLinkedList {

    public static  Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        System.out.println("Enter the Data: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> findMid(Node<Integer> head){
        if(head==null)
            return head;

        Node<Integer> fast = head, slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2){
        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }

        Node <Integer> newHead = null, node1 = head1, node2 =head2, newTail = null;
        if (node1.data < node2.data){
            newHead = node1;
            newTail = node1;
            node1= node1.next;
        }else {
            newHead = node2;
            newTail = node2;
            node2= node2.next;
        }

        while (node1 != null && node2 != null){
            if (node1.data < node2.data){
                newTail.next = node1;//jo chota hai uske equal
                newTail = newTail.next;
                node1 = node1.next;
            }else {
                newTail.next = node2;
                newTail = newTail.next;
                node2 = node2.next;
            }
        }

        if (node1 == null) {
            newTail.next = node2;
        }
        if (node2 == null) {
            newTail.next = node1;
        }
        return newHead;
    }

    public static Node<Integer> mergeSort(Node<Integer> head){
        if (head == null || head.next == null) {//Base Case
            return head;
        }


        Node <Integer> mid = findMid(head);//finding mid
        Node<Integer> head2 = mid.next;// part2 ke head is mid ka agla waala

        mid.next = null; // two linkedlist hogyi

        Node <Integer> firstHalf = mergeSort(head);//call for sorting the part1
        Node <Integer> secondHalf = mergeSort(head2); //call for sorting the part2




        //merging two sorted part1 and part2
        Node <Integer> finalHead = mergeTwoList(firstHalf,secondHalf);
        return finalHead;
    }






    public static void print(Node<Integer> newHead){
        while (newHead!=null){
            System.out.print(newHead.data+ " ");
            newHead =newHead.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> newHead = mergeSort(head);
        print(newHead);

    }
}