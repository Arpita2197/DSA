class BubbleSort {

    public static void bubbleSort(int[] arr , int n){
        for(int i = 0; i < n-1 ; i++ ){
            boolean isSwap = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    isSwap = true;
                }
            }

             if(!isSwap){      // array is already sorted
                return ;
             }
        }
    }

    public static void main(String[] args){
       // Bubble sort alwas iterate (n-1) & complexity ==> (n*2)
        int[] arr = {4,1,5,2,3};
       // int[] arr = {5,6,7,8,9};
        int n = 5;

         bubbleSort(arr , n);

         for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
         }

    }
}