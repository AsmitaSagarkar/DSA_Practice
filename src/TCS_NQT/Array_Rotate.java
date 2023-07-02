//Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
package TCS_NQT;

public class Array_Rotate {

    static int[] rotate(int []arr,int k){
        int []newArr = new int[arr.length];
        for (int i = 0; i <= k; i++) {
            newArr[i]=arr[i+k];
        }
        int n = arr.length-1;
        for (int i = 0; i < k; i++) {
            newArr[i+k+1]= arr[i];
            
        }

        
        return newArr;
    }
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7};
        int k = 3;

        int []res = rotate(arr,k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }
        
    }
}
