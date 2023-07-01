//Problem Statement: Given an array, we have to find the sum of all the elements in the array.

package TCS_NQT;

public class Array_Sum {

    public static int sum(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};
        int res = sum(arr);
        System.out.println("The sum of all elements of array is " + res);

    }
}
