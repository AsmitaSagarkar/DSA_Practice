package linked_list;

public class NodeUse {
    public static void print(Node<Integer> head)
    {
        //Node<Integer> temp = head;
        while(head!=null)
        {

            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
        /*head = temp; we should keep the reference of head in temp to print the linked list twice
        while(head!=null)
        {

            System.out.print(head.data + " ");
            head=head.next;
        }*/

    }

    public static void main(String[] args) {
        /*
        //we are creating first object
        Node<Integer> node = new Node<>(10);
        System.out.println(node.data);
        System.out.println(node.next);
        System.out.println("-------------------------------------------------------------------------------");
        //let's make the second object
        Node<Integer> node1=new Node<>(20);
        node.next = node1; //here in the address part of node ,we are storing the address of next node
        System.out.println(node.next);
        System.out.println(node1);
        //output will be same for both the statement

        System.out.println(node1.data);
        System.out.println(node1.next);

        //let's create the third object
        System.out.println("-------------------------------------------------------------------------------");
        Node<Integer> node2 = new Node<>(30);
        node1.next = node2;

        System.out.println(node1.next);
        System.out.println(node2);

        System.out.println(node2.data);
        System.out.println(node2.next);*/

        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        node1.next = node2;
        node2.next = node3;
        //node3.next = null;

        Node<Integer> head = node1; //here we have created a head pointer which point to the current node in the linked list

        /*
        first way to print the linked list
        while(head != null)
        {
            System.out.print(head.data + " "); // now here ,head can access the next and data part of the node
            head = head.next; //here we are storing the address of next node ao that link can be created
        */
        /*secont way: by creating a print function and calling it*/
        print(head);










    }
}
