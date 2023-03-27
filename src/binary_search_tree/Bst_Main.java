package binary_search_tree;

import java.util.Scanner;

public class Bst_Main {

    public static Node<Integer> input(Scanner sc){

        System.out.println("Enter the root data : ");
        int rootData = sc.nextInt();

        if (rootData == -1){
            return null;
        }
        Node<Integer> root = new Node<>(rootData);
        root.left = input(sc);
        root.right = input(sc);

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

    //check whether tree is bst or not
    public static int minimum(Node<Integer> root){
        if (root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }
    public static int maximum(Node<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.min(maximum(root.left),maximum(root.right)));
    }




    public static boolean check(Node<Integer> root){
        if (root == null){
            return true;
        }
        int leftmax = maximum(root.left);
        int rightmin = minimum(root.right);

        if (root.data<leftmax){
            return false;
        }
        if (root.data>rightmin){
            return false;
        }
        boolean isLeftBst = check(root.left);
        boolean isRightBst = check(root.right);

        if (isLeftBst&&isRightBst){
            return true;
        }
        else{
            return false;
        }


    }

    //optimised solution
    public static Pair<Boolean,Pair<Integer,Integer>> isBst(Node<Integer> root){
        if (root==null){
            Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
            output.first = true;
            output.second = new Pair<>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;

            return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBst(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBst(root.right);

        int min = Math.min(root.data,Math.min(leftOutput.second.first,rightOutput.second.first));
        int max = Math.max(root.data,Math.max(leftOutput.second.second,rightOutput.second.second));

        boolean isBst = (root.data>leftOutput.second.second) && (root.data<=rightOutput.second.first) && leftOutput.first && rightOutput.first;
        Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
        output.first = isBst;
        output.second = new Pair<>();
        output.second.first = max;
        output.second.second = min;

        return output;


    }
    //another way
    public static boolean isBst1(Node<Integer> root,int min,int max){
        if (root==null){
            return true;
        }
        if (root.data<min||root.data>=max){
            return false;
        }
        boolean isLeft = isBst1(root.left,min, root.data-1);
        boolean isRight = isBst1(root.right, root.data, max);

        return isLeft&&isRight;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> root = input(sc);
        print(root);
        System.out.println(check(root));

        System.out.println("Optimised solution");
        System.out.println(isBst(root));





    }
}


