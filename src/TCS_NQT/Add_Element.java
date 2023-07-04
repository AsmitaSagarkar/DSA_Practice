//Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.
package TCS_NQT;

public class Add_Element {

    //function to insert element at the begining
    static int[] insertAtBeginning(int []arr,int ele){
        int []new_arr = new int[arr.length+1];

        for (int i = 0; i < new_arr.length-1; i++) {
            new_arr[i+1]=arr[i];

        }
        new_arr[0] = ele;
//        for (int i = 0; i < new_arr.length; i++) {
//            System.out.println(new_arr[i]);
//
//        }
        arr = new_arr;
        return arr;

    }

    //function to insert element at the last

    public static int[] insertAtLast(int []arr,int ele){
        int []new_arr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            new_arr[i]=arr[i];

        }
        new_arr[new_arr.length-1]=ele;
//        for (int i = 0; i <new_arr.length ; i++) {
//            System.out.println(new_arr[i]);
//
//        }
        arr = new_arr;
        return arr;
    }

    //function to print element at random position
    public static int[] insertAtRandom(int[] arr,int ele,int index){
        int []new_arr= new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            new_arr[i]=arr[i];
        }
        new_arr[index] = ele;
        for (int i = index+1; i < new_arr.length; i++) {
            new_arr[i] =arr[i-1];

        }
//
        arr = new_arr;
        return arr;

    }
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        int []res = insertAtBeginning(arr,8);
        int []res1=insertAtLast(res,10);
        int []res2 = insertAtRandom(res1,100,3);
        for (int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);

        }



    }
}
