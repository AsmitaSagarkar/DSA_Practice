package TCS_NQT;

import java.util.Arrays;

public class Non_Repeating {

    public static void nonRepeating(int []arr){
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]==arr[i+1]){
                count = count+1;

            }
            if (count==1){
                System.out.print(arr[i]+ " ");
            }

        }
    }
    public static void main(String[] args) {
        int []arr={1,2,-1,1,3,1};
        nonRepeating(arr);
    }
}
