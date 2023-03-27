package linked_list;

import java.util.Scanner;

public class Update_Linked_List_Use {
    public static Update_Linked_List<Integer> input()
    {
        Update_Linked_List<Integer> head = null;
        Scanner sc= new Scanner(System.in);
        int data = sc.nextInt();

        while(data!=-1)
        {
            Update_Linked_List<Integer> NewNode = new Update_Linked_List<>(data);
            if (head==null)
            {
                head = NewNode;
            }
            else {
                Update_Linked_List<Integer> temp = head;
                while(temp.next!=null)
                {
                    temp= temp.next;
                }
                temp.next = NewNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    //updating the linked list
    public static Update_Linked_List<Integer> update(Update_Linked_List<Integer> head,int data,int pos)
    {
        Update_Linked_List<Integer> NewNode = new Update_Linked_List<>(data);
        if (pos==0)
        {
            NewNode.next = head;
            return NewNode;
        }
        int i=0;
        Update_Linked_List<Integer> temp = head;
        //using this we are reaching till pos -1 ;
        while(i<pos-1)
        {
            temp = temp.next;
            i++;
        }
        NewNode.next=temp.next;
        temp.next = NewNode;
        return head;
    }
    public static void print(Update_Linked_List<Integer> head) {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Update_Linked_List<Integer> head = input();
        Update_Linked_List<Integer> head2 = update(head,80,2);
        print(head2);



    }


}
