//Problem Statement: Given an array, we have to find the average of all the elements in the array.
package TCS_NQT;

public class Average {
    static int average(int []arr){
       int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];

        }
        return sum/n;
    }

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};
        int res = average(arr);
        System.out.println("Average = "+ res);

    }
}