package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Hash map is used to store the pairs .Here we store key and value
//Key is unique for every value and two value can be same but their keys are always different.
public class Hash_Map {
    public static void main(String[] args) {
        //create a hash map using the foolowing syntax
        HashMap<String,Integer> map = new HashMap<>();

        //insertion - put function will be used here

        map.put("India",350);
        map.put("China",200);
        map.put("Us",400);
        System.out.println(map);

        //now if any value is changed so previous value will be replaced by new value

        map.put("China",201);
        System.out.println(map);

        //searching - contains,get function will be used

        if (map.containsKey("China")){ //it returns true if key is present or return false if it is not there
            System.out.println("exists");
        }
        else {
            System.out.println("does not exist");
        }

        System.out.println(map.get("China")); //returns it value
        System.out.println(map.get("Indonesia"));


        //iteration
        //way 1
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " = " + e.getValue());
            System.out.println();
        }
        //way 2
        Set<String> key = map.keySet();
        for(String keys : key){
            System.out.println(keys+" "+map.get(keys));
        }
        //remove
        map.remove("China");
        System.out.println(map);




    }
}
