public class Subsetofarrayusingrecursion {


    public static int[][] subset(int input[])
    {
        return subset(input,0);
    }
    public static int[][] subset(int input[],int si)
    {
        if (si>=input.length) {
            int ans[][] = new int[1][0];
            return ans;
            
        }
        int smallans[][] = subset(input,si+1);
        int ans[][] = new int[2*smallans.length][];
        int k = 0; 
        for (int i = 0; i < smallans.length; i++) {
            ans[i] = new int[smallans[i].length];
            for (int j = 0; j < smallans[i].length; j++) {
                ans[i][j] = smallans[i][j];
                
            }
            k++;
            
        }
        for (int i = 0; i < smallans.length; i++) {
            ans[k+i] = new int[smallans[i].length + 1];
            ans[k+i][0]= input[si];
            for (int j = 1; j <= smallans[i].length; j++) {
                ans[i+k][j] = smallans[i][j-1];
                
            }
            
        }
        return ans;

        
    } 
    public static void main(String[] args) {

        int input[] = {15,20,12};
        int result[][] = subset(input);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
                
            }
            System.out.println();
            
            
        }
        
        
    }
    
}
