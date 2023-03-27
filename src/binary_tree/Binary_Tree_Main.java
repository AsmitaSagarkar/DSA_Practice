package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree_Main {
    //take input recursively
    public static Binary_Tree_Node<Integer> input(Scanner s){
        int rootData;
        System.out.println("Enter the data : ");
        rootData = s.nextInt();
        if (rootData==-1)
        {
            return null;
        }
        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);
        root.left = input(s);
        root.right = input(s);

        return root;
    }
    //take input iteratively
    public static Binary_Tree_Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Queue_Using_LinkedList<Binary_Tree_Node<Integer>> pendingNodes = new Queue_Using_LinkedList<>();
        System.out.println("enter root data : ");
        int rootData = sc.nextInt();
        if (rootData==-1){
            return null;
        }
        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            Binary_Tree_Node<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (Queue_Underflow_Exception e) {
                return null;
            }
            System.out.println("Enter left child " + rootData + " : ");
            int leftChild = sc.nextInt();
            if (leftChild!=-1){
                Binary_Tree_Node<Integer> child = new Binary_Tree_Node<>(leftChild);
                pendingNodes.enqueue(child);
                front.left=child;
            }
            System.out.println("Enter right child " + rootData + " : ");
            int rightChild = sc.nextInt();
            if (rightChild!=-1){
                Binary_Tree_Node<Integer> child = new Binary_Tree_Node<>(rightChild);
                pendingNodes.enqueue(child);
                front.right=child;
            }
        }
        return root;
    }

    public static void print(Binary_Tree_Node<Integer> root){
        if (root == null){
            return;
        }
        String toBePrinted = root.data + " : ";

        if (root.left!=null)
        {
            toBePrinted+= "L = "+ root.left.data + " , ";
        }
        if (root.right!=null)
        {
            toBePrinted+= "R = " + root.right.data + " , ";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);


    }
    //counts nodes

    public static int countNodes(Binary_Tree_Node<Integer> root){
        if (root==null){
            return 0;
        }
        int ans = 1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;

    }
    //diameter of tree - two nodes farthest from each other

    public static int height(Binary_Tree_Node<Integer> root){
        if (root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh,rh);
    }
    public static int diameter(Binary_Tree_Node<Integer> root){
        if (root==null){
            return 0;
        }
        int option1 = height(root.left)+height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1,Math.max(option2,option3));
    }
    //another function with min complexity
    public static Pair<Integer,Integer> heightDiameter(Binary_Tree_Node<Integer> root){
        if (root==null){
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer,Integer> lo = heightDiameter(root.left);
        Pair<Integer,Integer> ro = heightDiameter(root.right);

        int height = 1+Math.max(lo.first,ro.first);

        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;

        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }
    //inorder transversal

    public static void inorder(Binary_Tree_Node<Integer> root){
        if (root == null) {
            return;
        }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);

    }
    // preorder transversal

    public static void preorder(Binary_Tree_Node<Integer> root){
        if (root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //postorder transversal
    public static void postorder(Binary_Tree_Node<Integer> root){
        if (root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    //creating a tree from inorder and preorder
    public static Binary_Tree_Node<Integer> createTreeHelper(int []in,int []pre,int inStart,int inEnd,int preStart,int preEnd){
        if (inStart>inEnd)
        {
            return null;
        }
        int rootData = pre[preStart];
        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);

        int rootIndex = -1;
        for(int i = inStart;i<=inEnd ; i++){
            if (in[i]==rootData){
                rootIndex = i;
                break;
            }
        }
        if(rootIndex == -1){
            return null;
        }


        int leftInStart=inStart;
        int leftInEnd=rootIndex-1;
        int leftPreStart=preStart+1;
        int leftPreEnd=leftInEnd-leftInStart+leftPreStart;
        int rightInStart=rootIndex+1;
        int rightInEnd=inEnd;
        int rightPreStart=leftPreEnd+1;
        int rightPreEnd=preEnd;

        root.left= createTreeHelper(in,pre,leftInStart,leftInEnd,leftPreStart,leftPreEnd);
        root.right = createTreeHelper(in,pre,rightInStart,rightInEnd,rightPreStart,rightPreEnd);

        return root;


    }
    public static Binary_Tree_Node<Integer> createTree(int []in , int []pre)
    {
        return createTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
    }

    //create a tree from postorder and inorder
    public static Binary_Tree_Node<Integer> createAHelperTree(int []in,int []post,int inStart,int inEnd,int postStart,int postEnd ){
     if (inStart>inEnd){
         return null;
     }

     int rootData = post[postEnd];

     Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);
     int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == rootData)
                rootIndex=i;
            break;
        }
        if (rootIndex == -1){
            return null;
        }

        int leftInStart=inStart;
        int leftInEnd=rootIndex-1;
        int leftPostStart=postStart;
        int leftPostEnd=postStart - inStart + rootIndex-1;
        int rightInStart=rootIndex+1;
        int rightInEnd=inEnd;
        int rightPostStart=postEnd-inEnd+rootIndex;
        int rightPostEnd=postEnd-1;

        root.left=createAHelperTree(in,post,leftInStart,leftInEnd,leftPostStart,leftPostEnd);
        root.right = createAHelperTree(in,post,rightInStart,rightInEnd,rightPostStart,rightPostEnd);

     return root;
    }
    public static Binary_Tree_Node<Integer> createATree(int []in,int []post){
        return createAHelperTree(in,post,0,in.length-1,0,post.length-1);
    }

    //searching
    private static boolean isPresent = false;
    public static boolean search(Binary_Tree_Node<Integer> root,int x){
        if (root == null){
            isPresent=false;
        }
        if (root.left.data== x){
            isPresent = true;

        }
        if (root.right.data==x){
            isPresent=true;
        }
       return isPresent;
    }
    //mirror a binary tree
    public static Binary_Tree_Node<Integer> mirror(Binary_Tree_Node<Integer> root){
        if (root==null){
            return null;
        }
        mirror(root.left);
        mirror(root.right);

        Binary_Tree_Node<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
    //sum
    public static int sumOfAllNodes(Binary_Tree_Node<Integer> root){
       if (root == null){
            return 0;
        }
        int sumLeft=0;
        int sumRight = 0;

        sumLeft = sumOfAllNodes(root.left);
        sumRight = sumOfAllNodes(root.right);

        return sumRight+sumLeft+root.data;
    }

    //check whether tree is balanced or not i.e. depth of left subtree - depth of right subtree



    public static int checkBalanced(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkBalanced(root.left);
        if (leftHeight==-1){
            return -1;
        }
        int rightHeight = checkBalanced(root.right);
        if (rightHeight==-1){
            return -1;
        }
        if (Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

       return Math.max(leftHeight,rightHeight)+1;

    }
    public static boolean isBalanced(Binary_Tree_Node<Integer> root){
        return checkBalanced(root) != -1;
    }

    //remove leaf node
    public static Binary_Tree_Node<Integer> removeNode(Binary_Tree_Node<Integer> root){
        if (root == null){
            return null;
        }
        if (root.left==null&&root.right == null){
            return null;
        }
        root.left = removeNode(root.left);
        root.right = removeNode(root.right);
        return root;
    }
    //print level wise traversal
    public static void printLevel(Binary_Tree_Node<Integer> root){
        Queue<Binary_Tree_Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Binary_Tree_Node<Integer> temp = queue.poll();
            System.out.print(temp.data + " ");


            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
           // System.out.println();

        }
        System.out.println();

    }
    //zigzag tree
    public static ArrayList<ArrayList<Integer>> zigzagTree(Binary_Tree_Node<Integer> root){
        Queue<Binary_Tree_Node<Integer>> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();

        if (root == null){
            return wrapList;
        }

        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            ArrayList<Integer> subList = new ArrayList<>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index = i;
                if (queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                if (flag==true){
                    subList.add(queue.poll().data);
                }
                else{
                    subList.add(0,queue.poll().data);
                }

            }
            flag = !flag;
            wrapList.add(subList);
        }
        return wrapList;
    }
    public static void printArrayList(ArrayList<ArrayList<Integer>> wrapList){
        for (int i = 0; i < wrapList.size(); i++) {
            for (int j = 0; j < wrapList.get(i).size(); j++) {
                System.out.print(wrapList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    //nodes without sibling

    public static void  noSibling(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return;
        }
        if(root.left!=null&&root.right!=null){
            noSibling(root.left);
            noSibling(root.right);
        }
        if (root.right!=null){
            System.out.print(root.right.data + " ");
            noSibling(root.right);
        }
        if (root.left!=null){
            System.out.print(root.left.data + " ");
            noSibling(root.left);
        }
    }


    public static void main(String[] args) {
//        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(3);
//        Binary_Tree_Node<Integer> leftNode = new Binary_Tree_Node<>(1);
//        Binary_Tree_Node<Integer> rightNode = new Binary_Tree_Node<>(2);
//
//        root.left=leftNode;
//        root.right=rightNode;
        Scanner s = new Scanner(System.in);
        Binary_Tree_Node<Integer> root = input(s);

       // Binary_Tree_Node<Integer> root = takeInput();
        print(root);
//        System.out.println("Toatal nodes : " + countNodes(root));
//        System.out.println("Diameter : " + diameter(root));
//
//        System.out.println("Diameter(min complexity) : " + heightDiameter(root).second);
//        System.out.println("Height : " + heightDiameter(root).first);
//        System.out.print("Inorder transversal  :");
//        inorder(root);
//        System.out.println();
//        System.out.print("Preorder transversal : ");
//        preorder(root);
//        System.out.println();
//        System.out.print("Postorder transversal : ");
//        postorder(root);
//        System.out.println();
//
//        System.out.println("Constructing a tree from preorder and Inorder : ");
//        System.out.println("Inorder : 4,2,5,1,3,7");
//        System.out.println("Preorder : 1,2,4,5,3,7");
//
//        int [] in = {4,2,5,1,3,7};
//        int [] pre = {1,2,4,5,3,7};
//        System.out.println("Constructed tree : ");
//        Binary_Tree_Node<Integer> root1 = createTree(in,pre);
//        print(root1);
//
//        System.out.println("Constructing a tree from postorder and Inorder : ");
//        System.out.println("Inorder : 4,2,5,1,6,3,7");
//        System.out.println("Postorder : 4,5,2,6,7,3,1");
//
//        int [] inOrder = {4,2,5,1,6,3,7};
//        int [] postOrder = {4,5,2,6,7,3,1};
//
//        System.out.println("Constructed tree : ");
//        Binary_Tree_Node<Integer> root2 = createATree(inOrder,postOrder);
//        print(root2);
//
//        System.out.println("Is data present : " + search(root,10));
//
//        System.out.println("Mirror image of tree : ");
//        Binary_Tree_Node<Integer> root5 = mirror(root);
//        print(root5);
//
//        System.out.println("Sum of all nodes : " + sumOfAllNodes(root));
//        System.out.println("Is tree balanced = " + isBalanced(root));
//
//
////        System.out.println("Binary tree after removing leaf node : ");
////        Binary_Tree_Node<Integer> leafNode = removeNode(root);
////        print(leafNode);
//
//        System.out.println("Level wise traversal : ");
//        printLevel(root);

//        System.out.println("Zigzag tree traversal");
//        ArrayList<ArrayList<Integer>>rootZigzag = zigzagTree(root);
//        printArrayList(rootZigzag);
        System.out.println("Node with no sibling");
        noSibling(root);






    }
}
