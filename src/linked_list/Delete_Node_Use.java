package linked_list;

import java.util.Scanner;

public class Delete_Node_Use {
    public static Delete_Node<Integer> input()
    {
        Delete_Node<Integer> head = null;
        System.out.print("Enter data : ");
        Scanner sc = new Scanner(System.in);
        int data= sc.nextInt();
        System.out.println();

        while(data!=-1){
            Delete_Node<Integer> NewNode= new Delete_Node<>(data);
            if (head==null){
                head = NewNode;
            }
            else{
                Delete_Node<Integer> temp = head;
                while(temp.next!=null){
                    temp=temp.next;

                }
                temp.next=NewNode;
            }
            System.out.print("Enter data : ");
            data = sc.nextInt();
        }
        return  head;
    }
    public static Delete_Node<Integer> delete(Delete_Node<Integer> head ,int pos){
        //Delete_Node<Integer> del_node = new Delete_Node<>(data);
        if (pos == 0) {
            head = head.next;
            return head;


        }
        int i=0;
        Delete_Node<Integer> temp = head;
        while(i<pos-1)
        {
            temp = temp.next;
            i++;

        }
        temp.next = temp.next.next;
        return head;

    }
    public static void print(Delete_Node<Integer> head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Delete_Node<Integer> head = input();
        Delete_Node<Integer> delhead = delete(head  , 4);
        print(delhead);

    }
}
