package stack;

public class LinkedList_Main {
    public static void main(String[] args) throws Stack_Empty_Exception {
        Stack_Using_LinkedList<Integer> s = new Stack_Using_LinkedList<>();
        for (int i = 0; i < 5; i++) {
            s.push(i);

        }
        while (!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
}
