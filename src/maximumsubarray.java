//kadane's algorithm
public class maximumsubarray {
    static int maxsubarray(int a[])
    {
        int maxsum =Integer.MIN_VALUE;
        int currentsum=0;
        
        for (int i = 0; i < a.length; i++) {
            
                currentsum =currentsum +a[i];
                if (currentsum>maxsum) 
                {
                    maxsum = currentsum;
                    
                }
                if(currentsum<0)
                {
                    maxsum = 0;
                }
                
            
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int a[]={1, 3, 8, -2, 6, -8, 5};
        //int maxsum = Integer.MIN_VALUE;
        System.out.println(maxsubarray(a));
        

                
            }
            
            
       
        
    }
    

