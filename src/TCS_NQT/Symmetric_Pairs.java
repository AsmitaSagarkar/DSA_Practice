package TCS_NQT;

import java.util.HashMap;

public class Symmetric_Pairs {

    public static void symmetricPair(int [][]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i][0];
            int value = arr[i][1];

            if (map.get(value)!=null && map.get(value) == key){
                System.out.print("(" + key + "," + value+")  ");
            }
            else {
                map.put(key,value);
            }

        }

        
    }
    public static void main(String[] args) {
        int [][]arr = {{1, 2}, {2, 1}, {3, 4}, {4, 5},{5, 4}};
        symmetricPair(arr);

    }
}
