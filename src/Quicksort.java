public class Quicksort {

    static void quicksort(int input[] , int startingindex , int endingindex)
    {
        if (startingindex >= endingindex) {
            return;
            
        }
        int p = partition(input, startingindex, endingindex);
        quicksort(input, startingindex, p-1);
        leftsort(input, 0, p-1);
        quicksort(input, p + 1, endingindex);
        rightsort(input, p+1, endingindex);
    }
    static int[] leftsort(int input[] , int startingindex , int endingindex)
    {
      for (int i = 0; i < endingindex+1; i++) {
        for (int j = i; j < endingindex+1; j++) {
          if (input[i]>input[j]) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            
          }
          
        }
        
      }
      return input;

    }
    static int[] rightsort(int input[] , int startingindex , int endingindex)
    {
      for (int i = startingindex; i < endingindex+1; i++) {
        for (int j = i; j < endingindex+1; j++) {
          if (input[i]>input[j]) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            
          }
          
        }
        
      }
      return input;

    }

    static int partition(int input[] , int startingindex , int endingindex)
    {
      int pivot = input[startingindex];
      int count = 0;

      for (int i = startingindex+1; i < endingindex; i++) {
        if (input[i]<pivot) {
            count++;
        }
      }
      int pivotindex = startingindex + count;
      int temp = input[startingindex];
      input[startingindex] = input[pivotindex];
      input[pivotindex] = temp;
      
      int i = startingindex;
      int j = endingindex;

      while (i<pivotindex&&j>pivotindex) {
        if (input[i]<=pivot) {
            i++;
            
        }
        else if (input[j]>pivot) {
            j--;
            
        }
        else
        {
            int temp1 = input[i];
            input[i] = input[j];
            input[j]=temp1;
            i++;
            j--;
        }
        
      }
      return pivotindex;

    }
    
    public static void main(String[] args) {
        int input[] = {10,18,19,9,2,6,11};
        //Sort(input,input.length);
        quicksort(input, 0, input.length-1);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
            
        }
        
    }
    
}
