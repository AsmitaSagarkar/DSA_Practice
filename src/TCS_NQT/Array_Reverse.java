//Problem Statement: You are given an array. The task is to reverse the array and print it.
package TCS_NQT;

public class Array_Reverse {

    public static int[] reverse(int []arr){
        int []new_arr = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            new_arr[arr.length-i-1]=arr[i];

        }
        return new_arr;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []new_arr = reverse(arr);
        for (int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);

        }

    }
}
