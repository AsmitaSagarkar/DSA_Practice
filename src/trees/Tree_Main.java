package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree_Main {


    public static Tree_Node<Integer> takeInput(){
        int n;
        Scanner sc = new Scanner(System.in); //at every call scanner is getting called ,so we are passing scanner as an argument so that scanner will be called once
        System.out.println("Enter the next node data : ");//if we create scanner here ,so we have to input data one after the another.
        n = sc.nextInt();
        Tree_Node<Integer> rootNode = new Tree_Node<>(n);

        System.out.println("Enter the number of children for " + n);
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++) {
            Tree_Node<Integer> child = takeInput();
            rootNode.children.add(child);
        }
        return rootNode;
    }
//    public static Tree_Node<Integer> takeInputLevelWise(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter root data");
//        int rootData = sc.nextInt();
//        Queue_Using_LinkedList<Tree_Node<Integer>> pendingNodes = new Queue_Using_LinkedList<>();
//        Tree_Node<Integer> root = new Tree_Node<>(rootData);
//        pendingNodes.enqueue(root);
//        while (!pendingNodes.isEmpty()){
//            try {
//                Tree_Node<Integer> frontNode = pendingNodes.dequeue();
//                System.out.println("enter number of children of : " + frontNode.data);
//                int numChildren = sc.nextInt();
//                for (int i = 0; i < numChildren; i++)
//                {
//                    System.out.println("enter " +(i+1) +" th child of " + frontNode.data);
//                    int child= sc.nextInt();
//                    Tree_Node<Integer> childNode = new Tree_Node<>(child);
//                    frontNode.children.add(childNode);
//                    pendingNodes.enqueue(childNode);
//
//                }
//            } catch (Queue_Underflow_Exception e) {
//                return null;//never occur;
//            }
//
//        }
//        return root;
//    }
    public static void print(Tree_Node<Integer> root){
        StringBuilder s = new StringBuilder(root.data + ":");
        for (int i = 0; i < root.children.size(); i++) {
            s.append(root.children.get(i).data).append(",");
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size() ; i++) {
            print(root.children.get(i));

        }

    }

    //count number of nodes
    public static int countNodes(Tree_Node<Integer> root){
        if(root==null){
            return 0;
        }
        int count=1;
        for (int i = 0; i < root.children.size(); i++) {
            count = count + countNodes(root.children.get(i));
            
        }
        return count;
    }
    //largest node of the tree
    public static int largestNode(Tree_Node<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largestNode(root.children.get(i));
            if (childLargest>ans){
                ans = childLargest;
            }

        }
        return ans;
    }
    //height of the tree
    public static int height(Tree_Node<Integer> root){
        if (root==null){
            return 0;
        }
        if (root.children.size()==0){
            return 1;
        }
        int temp = 0,Height = 0;
        for (int i = 0; i < root.children.size(); i++) {
            temp=height(root.children.get(i));

            if (temp>Height)
            {
                Height = temp;
            }

        }
        return Height+1;

    }
    //print at k
    public static void printAtK(Tree_Node<Integer> root,int k){
        if (k<0){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtK(root.children.get(i),k-1);
            
        }

    }
    //count leaf node

    public static int countLeafNode(Tree_Node<Integer> root){
        int leaf=0;

        if (root == null){
            return 0;
        }
        if (root.children.size() == 0){
            return 1;
        }

        for (Tree_Node<Integer> child: root.children) {
            leaf = leaf + countLeafNode(child);

        }
        return leaf;
    }

    //preorder traversal

    public static void preOrder(Tree_Node<Integer> root)
    {
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            preOrder(root.children.get(i));

        }
    }
    //postorder traversal
    public static void postOrder(Tree_Node<Integer> root)
    {
        //System.out.print(root.data + " ");
        for (int i = 0; i <root.children.size() ; i++) {
            postOrder(root.children.get(i));

        }
        System.out.print(root.data+" ");
    }
    //sum of all nodes
    static int sum=0;
    public static int calculateSum(Tree_Node<Integer> root) {
        sum = sum + root.data;
        for (int i = 0; i < root.children.size(); i++)
        {
            calculateSum(root.children.get(i));
        }
        return sum;


    }

    //Count Nodes greater than x
    private static int count = 0;
    public static int countNodesGreaterThanX(Tree_Node<Integer> root,int x)
    {
       if (root.data>x){
           count++;

       }
        for (int i = 0; i < root.children.size(); i++) {
            countNodesGreaterThanX(root.children.get(i),x );

        }
        return count;
    }
    //check if generic tree contain element x
     private static boolean isPresent=false;
    public static boolean containsX(Tree_Node<Integer> root,int x){
        if (root==null){
            return isPresent;
        }
        if (root.data==x){
            isPresent=true;
            return isPresent;
        }
        for (int i = 0; i < root.children.size(); i++) {
            isPresent = containsX(root.children.get(i),x );

        }
        return isPresent;
    }
    //replace node with depth
    private static void replace(Tree_Node<Integer> root , int depth){
        root.data=depth;

        for (int i = 0; i <root.children.size() ; i++) {
            replace(root.children.get(i), depth +1 );

        }
    }
    public static void replaceWithDepth(Tree_Node<Integer> root)
    {
        int depth =0;
        replace(root,depth);
    }
    //node having sum of children and node is max
    static class pair{
        Tree_Node<Integer> node;
        int sum ;
        pair(Tree_Node<Integer>node,int sum){
            this.node=node;
            this.sum=sum;
        }
    }
    private static ArrayList<pair> a1 = new ArrayList<>();
    private static int maxSum = Integer.MIN_VALUE;
    private static pair maxPair;

    private static pair maxPairfn(Tree_Node<Integer> root){
        int allSum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            allSum+=root.children.get(i).data;

        }
        pair res = new pair(root,allSum);
        a1.add(res);

        for (int i = 0; i < root.children.size(); i++) {
            maxPairfn(root.children.get(i));

        }
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i).sum>maxSum){
                maxSum=a1.get(i).sum;
                maxPair=a1.get(i);
            }

        }
        return maxPair;

    }
    public static int maxSumNode(Tree_Node<Integer> root){
        pair res = maxPairfn(root);
        return res.node.data;
    }
    //structurally identical
    private static ArrayList<Integer> storeNodeToArraylist(Tree_Node<Integer> root,ArrayList<Integer> a){
        a.add(root.data);
        for (int i = 0; i <root.children.size() ; i++) {
            storeNodeToArraylist(root.children.get(i),a );

        }
        return a;
    }
    public static boolean checkIdentical(Tree_Node<Integer> root1,Tree_Node<Integer> root2){
        ArrayList<Integer> a1=new ArrayList<>();
        a1=storeNodeToArraylist(root1,a1);
        a1=storeNodeToArraylist(root1,a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2 = storeNodeToArraylist(root2,a2);

        if (a1.size()>a2.size() || a1.size()<a2.size()){
            return false;
        }
        else{
            for (int i = 0; i <a1.size() ; i++) {
                if (a1.get(i)!=a2.get(i)){
                    return false;
                }

            }
            return true;
        }


    }
    //next larger element
    private static Tree_Node<Integer> nextLarger = new Tree_Node<>(Integer.MAX_VALUE);

    public static int findLargerNode(Tree_Node<Integer> root,int n){
        if (root.data>n&&root.data<nextLarger.data){
            nextLarger=root;
        }
        for (int i = 0; i < root.children.size(); i++) {
            findLargerNode(root.children.get(i),n );

        }
        return nextLarger.data;
    }
    //second-largest element in the tree
   private static Tree_Node<Integer> largest = new Tree_Node<>(Integer.MIN_VALUE);
    private static Tree_Node<Integer> secondLargest = new Tree_Node<>(Integer.MIN_VALUE);

    public static int findSecondLargest(Tree_Node<Integer> root){
        if (root.data>largest.data){
            if (largest.data!=Integer.MIN_VALUE){
                secondLargest=largest;
            }
            largest=root;
        }
        else if (root.data>secondLargest.data && root.data<largest.data){
            secondLargest=root;
        }
        for (int i = 0; i < root.children.size(); i++) {
            findSecondLargest(root.children.get(i));

        }
        return secondLargest.data;
    }



    public static void main(String[] args) {
//        Tree_Node<Integer> root = new Tree_Node<>(4);
//        Tree_Node<Integer> node1 = new Tree_Node<>(5);
//        Tree_Node<Integer> node2 = new Tree_Node<>(6);
//        Tree_Node<Integer> node3 = new Tree_Node<>(7);
//        Tree_Node<Integer> node4 = new Tree_Node<>(8);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//
//        System.out.println(root);
        //Scanner sc = new Scanner(System.in);
        System.out.println("Input tree 1:");
        Tree_Node<Integer> root = takeInput();
        //Tree_Node<Integer> root = takeInputLevelWise();
        //assert root != null;

        print(root);
//        System.out.println("Input tree 2:");
//        Tree_Node<Integer> root1=takeInput();
//        print(root1);
        System.out.println("no of nodes : "+countNodes(root));
        System.out.println("largest node : " + largestNode(root));
        System.out.println("Height of the node : " + height(root));
        printAtK(root,2);
        System.out.println("Toatal number of leaf nodes : " + countLeafNode(root));
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        //System.out.println("sum : " + calculateSum(root));
        //System.out.println(calculateSum(root));
        System.out.println(calculateSum(root));
        System.out.println(countNodesGreaterThanX(root,3));
        //System.out.println(countNodesGreaterThanX(root,3));
        System.out.println(containsX(root,4));
       // replaceWithDepth(root);
       // print(root);

//        System.out.println(maxSumNode(root));
//        System.out.println(checkIdentical(root,root1));
        System.out.println(findLargerNode(root,3));
        System.out.println(findSecondLargest(root));

    }
}
