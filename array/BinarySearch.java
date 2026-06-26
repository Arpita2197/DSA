class BinarySearch{
     
    static int BinarySerch(int[] arr , int start , int end , int target){
    
     while(start <= end){
      //  int mid = (start + end) / 2;     // overflow..

       int mid = start + (end - start)/2;

         if(target < arr[mid]){
            end = mid - 1 ;
         }
         else if(target > arr[mid]){
            start = mid + 1;
         }
         else {
            return mid;
         }
     }
         return -1 ;
    }
    
  public static void main(String[] args) {

      int[] arr = {-1 , 0 , 3 , 4 , 5 , 9 , 12 }; // odd
      int target = 9;

    // int[] arr = {-1 , 0 , 2 , 5 , 9 , 12};
    // int target = 0;
   
    int start = 0;
    int end = arr.length-1;

    System.out.println(BinarySerch(arr , start , end , target));

  }
    
}