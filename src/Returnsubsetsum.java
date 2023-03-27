public class Returnsubsetsum {


    public static int[][] subset(int input[] , int k)
    {
        return sum(input, k, 0);

    }
    public static int[][] sum(int input[],int k,int si)
    {
      if (si==input.length) 
      {
        if (k==0) {
            return new int[1][0];
            
        } else {
            return new int[0][0];
            
        }
        
      }
      int op1[][] = sum(input, k-input[si], si+1);
      int op2[][] = sum(input, k, si+1);
      int output[][]= new int[op1.length+op2.length][];
      int l=0;

      for (int i = 0; i < op2.length; i++) {
        output[i]= new int[op2[i].length];
        for (int j = 0; j < op2[i].length; j++) {
            output[l][j]=op2[i][j];
            
        }
        l++;
        
      }
      for (int i = 0; i < op1.length; i++) {
        output[i+1]=new int[op1[i].length+1];
        output[i+1][0]=input[si];
        for (int j = 1; j <= op1[i].length; j++) {
            output[i+1][j]=op1[i][j-1];
            
        }
        
      }
      return output;

    }
    public static void main(String[] args) {
        int arr[]={5 ,12, 3 ,17, 1, 18, 15, 3 ,17};
        int result[][] = subset(arr, 6);

        /*for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
                
            }
            
        }*/
        System.out.println(result);
    
}
    
}
