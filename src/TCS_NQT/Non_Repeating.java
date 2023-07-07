package TCS_NQT;

import java.util.*;

public class Non_Repeating {

    public static void nonRepeating(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.get(i)==null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }

        }
        for (Map.Entry<Integer,Integer> e :map.entrySet()){
            if (e.getValue()==1){
                System.out.print(e.getKey()+ " ");
            }
            ;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,-1,1,3,1};
        nonRepeating(arr);
    }
}
