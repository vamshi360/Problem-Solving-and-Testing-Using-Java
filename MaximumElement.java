class MaximumElement{
    public static void main(String[] args){
        int[] arr = {3,14,56,89,7};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is:" + max);
   }
}