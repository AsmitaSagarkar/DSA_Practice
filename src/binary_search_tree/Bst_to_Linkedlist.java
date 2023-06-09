package binary_search_tree;

import java.util.Scanner;

public class Bst_to_Linkedlist {

    public static Node<Integer> input(Scanner sc){
        System.out.println("Enter the data");
        int rootData = sc.nextInt();

        if (rootData==-1){
            return null;
        }

        Node<Integer> root = new Node<>(rootData);
        root.left = input(sc);
        root.right = input(sc);

        return root;
    }
    public static Linked_List_Node<Integer> bstToLinkedList(Node<Integer> root){

        if (root == null)
        {
            return null;
        }
        Linked_List_Node<Integer> head = new Linked_List_Node<>(root.left.data);
        Linked_List_Node<Integer> tail = new Linked_List_Node<>(root.right.data);
        Linked_List_Node<Integer> temp = new Linked_List_Node<>(root.data);



        while(root.left!=null && root.right !=null){


            head.next = bstToLinkedList(root.left);
            tail.next = bstToLinkedList(root.right);

        }

        head.next = temp;
        temp.next = tail;
        return head;




    }
    public static void print(Linked_List_Node<Integer> head){
        while (head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Node<Integer> root = input(sc);
       // System.out.println(bstToLinkedList(root));
        Linked_List_Node<Integer> list = bstToLinkedList(root);
        print(list);



    }

}
