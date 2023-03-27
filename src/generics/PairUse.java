package generics;

public class PairUse {
    public static void main(String[] args) {
       // Pair<String> p = new Pair<String>("asmita","aastha");

       /* p.setFirst(10);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());*/
        /*p.setFirst("asmita");
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());*/

        //here if we want to use int ,so we cannot use the keyword int .we have to use the keyword Integer and for character we ccant use char we have to use Character
        //it means we cannot use primitive here we have to use their classes. Integer and Character are their classes

        /*Pair<Integer> p1 = new Pair<Integer>(1,2);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());*/

        //now if we want first as integer and second as string so we have do this in this way :
         Pair<String,String> p = new Pair<>("asmita","aastha");
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        Pair<String,Integer> p1 = new Pair<>("asmita",10);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());


    }
}
