package classes_and_object;

public class DynamicArray {
    private int [] arr;
    private int nextindex;

    public DynamicArray()
    {
        arr = new int[5];
        nextindex=0;
    }
    public int size()
    {
        return nextindex;
    }
    public void add(int element)
    {
        if (nextindex==arr.length){
            restructure();
        }
        arr[nextindex]= element;
        nextindex++;
    }
    public void set(int index,int element){
        if (index>nextindex){
            return;
        }
        if (index<nextindex){
            arr[index] = element;

        }
        else{
            add(element);
        }
    }
    public int get(int index)
    {
        if (index>=nextindex)
        {
            return -1;
        }
        return arr[index];
    }
   public boolean isEmpty(){
        if (size()==0)
        {
            return true;
        }
        return false;

}
public int removelast(){
        if (size()==0){
            return -1;
        }
        int value = arr[nextindex-1];
        arr[nextindex-1]=0;
        nextindex--;
        return value;
}
    private void restructure(){
        int[] temp = arr;
        arr = new int[2*temp.length];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];

        }

    }





}
