package stack;

public class Stack_Main {
    public static void main(String[] args) throws Stack_Overflow_Exception, Stack_Empty_Exception {
        Stack_Using_Array s= new Stack_Using_Array();

        for (int i = 0; i < 5; i++) {
            s.push(i);

        }
        while (!s.isEmpty()){
            System.out.println(s.pop());

        }

    }
}
