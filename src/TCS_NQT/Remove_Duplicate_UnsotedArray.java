//Problem Statement: Given an unsorted array, remove duplicates from the array.
package TCS_NQT;

public class Remove_Duplicate_UnsotedArray {

    static void removeDuplicate(int []arr){
        int []mark = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mark[i]=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (mark[i] == 1) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j])
                    {
                        mark[j] = 0;
                    }

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (mark[i]==1){
                System.out.print(arr[i] + " ");
            }

        }
    }
    public static void main(String[] args) {
        int []arr = {2,3,1,9,3,1,3,9};
        removeDuplicate(arr);

    }
}
