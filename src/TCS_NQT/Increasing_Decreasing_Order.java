//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
package TCS_NQT;

import java.util.Arrays;

public class Increasing_Decreasing_Order {

    public static void increasingDecreasing(int []arr){
        Arrays.sort(arr);
        int mid = arr.length/2;

        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length-1; i >=mid; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr = {8 ,7 ,1, 6, 5, 9};
        increasingDecreasing(arr);

    }
}
