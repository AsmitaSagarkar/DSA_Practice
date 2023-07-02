//Problem Statement: Given an array, we have to find the average of all the elements in the array.
package TCS_NQT;

import java.util.Arrays;

public class Median {

    static void median(int []arr){
        Arrays.sort(arr);
        int n = arr.length;
//        int median = 0;

        if (n%2==0) {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.print((double)(arr[ind1] + arr[ind2]) / 2);


        }
        else{
            int mid = n/2;
            System.out.print(arr[mid]);
        }

    }
    public static void main(String[] args) {

        int []arr = {2,5,1,7};
//        int res = median(arr);
        System.out.print("Median = ");
        median(arr);

    }
}
