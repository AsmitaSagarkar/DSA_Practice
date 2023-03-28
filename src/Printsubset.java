public class Printsubset {
    
    public static void printsubset(int input[])
    {
        int output[] = new int[0];
        printsubset(input, 0, output);

    }
    public static void printsubset(int input[],int si,int output[])
    {
        if (si==input.length) {
            for (int i : output) {
                System.out.print(i + " ");
                
            }
            System.out.println();
            return;
            
        }
        printsubset(input, si+1, output);
        int newoutput[] = new int[output.length+1];
        int j;
        for ( j = 0; j < output.length; j++) {
            newoutput[j] = output[j];
            
        }
        newoutput[j] = input[si];
        printsubset(input, si+1, newoutput);



    }
    public static void main(String[] args) {
        int arr[] = {15,20,12};
        printsubset(arr);
        
    }
    
}
