package TCS_NQT;

import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class Repalce_By_Rank {

    //it only worked if all the elements are unique
    public static int[] replaceByRank(int []arr){
        int []ans = new int[arr.length];
        int count=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    count = count+1;
                }
            }
//            map.put(i,count);


            ans[i] = count+1;
            count = 0;





        }
        return ans;
    }

    public static void rankUsingMap(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int []new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i]=arr[i];

        }
        int temp =1;
        Arrays.sort(new_arr);
        for (int i = 0; i < arr.length; i++) {
            //if element is previously not store in the map
            if (map.get(new_arr[i]) == null) {
                map.put(new_arr[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(map.get(new_arr[i]) + " ");
        }

    }
    public static void main(String[] args) {
        int []arr = {1, 5, 8, 15, 8, 25, 9};
        int []res = replaceByRank(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }
        System.out.println("-----------------------------");
        rankUsingMap(arr);

    }
}
