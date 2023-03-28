 public class Mergesort {

    static void mergesort(int input[] , int startindex, int endindex)
    {
        if(startindex>=endindex)
        {
            return;
            
        }
        int mid = (startindex + endindex)/2;
        mergesort(input,startindex,mid);
        mergesort(input, mid+1, endindex);
        merge(input, startindex, endindex);

    }
    private static void merge(int input[] , int startindex, int endindex)
    {
        int mid = (startindex + endindex)/2;
        int ans[] = new int[endindex - startindex + 1];
        int i = startindex;
        int j = mid + 1;
        int k = 0;

        while(i<=mid && j<= endindex)
        {
            if (input[i]<input[j]) {
                ans[k] = input[i];
                i++;
                k++;
                
            }
            else{
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
            ans[k] = input[i];
            i++;
            k++;
            
        }
        while(j<=endindex)
        {
            ans[k] = input[j];
            k++;
            j++;
        }
        for (int k2 = 0; k2 < ans.length; k2++) {
            input[startindex + k2] = ans[k2];
            
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,2,8,9,4,10};
        mergesort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            
        }
        
    }


}