//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same

package TCS_NQT;


public class Remove_Duplicate_Sorted {
    static int removeDuplicate(int []arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]!=arr[i]) {
                i++;
                arr[i]=arr[j];
            }

        }

     return i+1;

    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3};
        int res = removeDuplicate(arr);
        for (int i = 0; i < res; i++) {
            System.out.println(arr[i]);

        }

    }
}
