package linked_list;

import java.util.Scanner;

public class Length_Use {

    public static int input(){
        Length_of_Linked_list<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data : ");
        int i = 0;
        int data = sc.nextInt();
        while(data != -1){
            Length_of_Linked_list<Integer> NewNode = new Length_of_Linked_list<>(data);
            if (head==null){
                head = NewNode;
            }
            else{
                Length_of_Linked_list<Integer> temp = head;
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = NewNode;
            }
            System.out.print("Enter data : ");
            data = sc.nextInt();
            i++;
        }
        return  i;


    }

    public static void main(String[] args) {
        System.out.println("Length of the linked list : " + input());
    }
}
