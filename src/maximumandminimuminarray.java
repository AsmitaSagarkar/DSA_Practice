public class maximumandminimuminarray {
    public static void main(String[] args) {
        int []a= {0,30000,1000, 11, 445, 1, 330, 3000};
        int min;
        int max;

        min=a[0];
        max =a[0];

        for (int i = 1; i < a.length; i++) 
        {
            if (max<a[i]) {
                max = a[i];
                
            }
            else if (min>a[i]) {
                min =a[i];
                
            }
            
        }
        System.out.println("Largest element in the given array = " + max);
        System.out.println("Smallest element in the given array is  = " + min);

    }
}
