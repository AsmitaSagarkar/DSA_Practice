package TCS_NQT;

public class Maximum_Product_Subarray {
    public static int maxProduct(int []arr){
        int result = arr[0] , product1=arr[0],product2=arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i],Math.max(product1*arr[i],product2*arr[i]));
            product2 = Math.min(arr[i],Math.max(product1*arr[i],product2*arr[i]));
            product1 =temp;
            result = Math.max(result,product1);

        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {1,2,-3,0,-4,-5};
        System.out.println(maxProduct(arr));

    }
}



