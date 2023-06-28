//Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
package TCS_NQT;

public class SecondSmallest_SecondLargest {

    public static int secondMin(int []arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i]<secondSmallest && arr[i]!=smallest) {
                secondSmallest = arr[i];
                
            }

        }


        return secondSmallest;
    }
    public static int secondLargest(int []arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];

            }

        }return secondLargest;
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,7,7,5};

        int res = secondMin(arr);
        int result = secondLargest(arr);
        System.out.println("Second smallest element in the array = " + res);
        System.out.println("Second largest element in the array = " + result);


    }
}
