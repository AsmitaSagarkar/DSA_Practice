package linked_list;

import java.util.Scanner;

public class Input_Linked_List_Use {
    public static Input_Linked_List<Integer> input()
    {
        Input_Linked_List<Integer> head = null;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();

       System.out.println();
        
        while(data!=-1)
        {
            Input_Linked_List<Integer> NewNode = new Input_Linked_List<>(data);
            if (head == null)
            {
                head = NewNode;
            }
            else {
                Input_Linked_List<Integer> temp = head;
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
    public static void print(Input_Linked_List<Integer> head) {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    



    public static void main(String[] args) {
        Input_Linked_List<Integer> head = input();
        print(head);

    }
}
