//Problem Statement: Given an array, we have to find the smallest element in the array.
package TCS_NQT;

public class Smallest_Element_Array {

    public static int minElement(int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }

        }
        return min;
    }
    public static void main(String[] args) {

        int arr[] = {8,10,5,7,9};
        int res = minElement(arr);
        System.out.println("Smallest element in the array = " + res);

    }
}
