package Hashing;

//Hash_Set is the data structure which contains all unique elements . It is one of the best structure because it provides constant time(o(1)) for insertion ,deletion and searching
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        //syntax  to create a hashset
        HashSet<Integer> set = new HashSet<>();
        //add element to hashset - add function is used

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //here 1 will be stored only once;

        //searching - contains function will be used

        if(set.contains(1)){
            System.out.println("1 is present");
        }

        //delete - remove function will be used

        set.remove(1);
        if (!set.contains(1)){
            System.out.println("we deleted 1");
        }
        
        //to print all elements - we just have to write the name of hashset

        System.out.println(set);
        
        
        //if we want to traverse the hashset so we have to use the special function called iterator
        //we first have to import its package

        Iterator it = set.iterator();
        //here traverse value of set is stored in "it";
        //here two functions will be used -
        //next()-it the value of next iteration
        //hasNext() - it returns true if next iteration is there and returns false if there is no iteration or value present

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //isme esa jaruri nhi hai ki jis pattern mai value insert hui hai usi order mai return ho.It does not gurantee the order of value


    }
}
