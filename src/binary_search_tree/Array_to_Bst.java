package binary_search_tree;

import java.util.Scanner;

public class Array_to_Bst {
    public static Node<Integer> bst(int []arr,int start,int end){
        if (start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node<Integer> root = new Node<>(arr[mid]);

        root.left = bst(arr,start,mid-1);
        root.right = bst(arr,mid+1,end);
        return root;
    }

    public static void print(Node<Integer> root){
        if (root == null){
            return;
        }
        String tobePrinted = root.data + " : ";

        if (root.left != null){
            tobePrinted = tobePrinted + "L : " + root.left.data + ",";
        }
        if (root.right != null){
            tobePrinted = tobePrinted + "L : " + root.right.data + ",";
        }
        System.out.println(tobePrinted);
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array :");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Node<Integer> bst = bst(arr,0,size-1);
        print(bst);
    }
}
