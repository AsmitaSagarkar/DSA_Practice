package arraylist;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");

        }
        System.out.println();

        list.add(2,5);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        list.remove(3);
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        list.set(1,100);
        System.out.println(list.get(1));
    }

}
