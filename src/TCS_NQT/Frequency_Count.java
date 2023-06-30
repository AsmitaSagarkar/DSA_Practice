//Problem statement: Given an array, we have found the number of occurrences of each element in the array.
package TCS_NQT;

public class Frequency_Count {

    public static void frequencyCount(int []arr){
        boolean []visited =new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]==true){
                continue;

            }
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    visited[j] = true;
                    count++;
                }

            }
            System.out.println("Frequency count of " + arr[i] + " = " + count);

        }
    }
    public static void main(String[] args) {
        int []arr = {10,5,10,15,10,5};
        frequencyCount(arr);

    }
}
