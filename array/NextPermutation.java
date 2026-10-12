class NextPermutation {

    public static void main(String[] args){
          int[] arr = {1,2,3};
       // int[] arr = {5,4,3};

        int pivot = -1;
           
           // finding pivot value.....
         for(int i = arr.length-2 ; i >= 0 ; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;   // idx = 1
                break;
            }
         }
             
             // next larger element.....
        for(int i = arr.length-1 ; i > pivot ; i--){
            if(arr[i] > arr[pivot]){
                 // then this is right most value , so swap the pivot with this value

                 int temp = arr[pivot];
                 arr[pivot] = arr[i];
                 arr[i] =  temp;
                 break;
            }
        }

        // now reverse remainig part of an array

        int i = pivot+1;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
       }

        if(pivot == -1){      // poora array ko swap kar do
          int k = 0;
          int l = arr.length-1;

           while(k < l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;

             k++;
             l--;
           }

        }

        for(int m = 0 ; m < arr.length ; m++){
           System.out.println(arr[m]);
        }
       
    }
}