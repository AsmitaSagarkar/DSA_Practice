//Problem Statement: Given an array, we have to find the largest element in the array.
package TCS_NQT;

public class Largest_Number_Array {
    public static int maxElement(int []arr){
        int max =arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max = arr[i];
            }

        }
        return max;
}

    public static void main(String[] args) {
        int []arr = {8,10,5,7,9};
        int res = maxElement(arr);
        System.out.println("Largest element in the array = " + res);

    }
}
