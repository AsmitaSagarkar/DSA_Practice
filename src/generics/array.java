package generics;

public class array {

    public static <T> void print(T input[])
    {
        for (T t : input) {
            System.out.print(t);
            System.out.print(" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[10];
        for (int i = 0; i < 10 ; i++) {
            input[i] = i+1;

        }

        print(input);

        String[] input1 = new String[10];
        for (int i = 0; i <10 ; i++) {
            input1[i] = "asmita";

        }
        print(input1);
    }

}
