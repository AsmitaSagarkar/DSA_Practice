public class Staircase {

    public static int staircase(int n)
    {
        if (n<0) {
            return 0;
            
        }
        if (n==0) {
            return 1;
            
        }
        int case1 = staircase(n-1);
        int case2 = staircase(n-2);
        int case3 = staircase(n-3);

        return case1 + case2  + case3;

    }
    public static void main(String[] args) {

        int n = 5;
        System.out.println(staircase(n));
        
    }
    
}
