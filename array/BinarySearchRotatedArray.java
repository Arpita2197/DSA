class BinarySearchRotatedArray {

    public static void main(String[] args){       

        int[] arr = {3,4,5,6,7,0,1,2};    // Rotated array in ascending order(sorted) , with distinct values..
        
        int target = 0;
        int start = 0;
        int end = arr.length-1;

       

        while(start <= end){
            
            int mid = start + (end-start)/2;
          
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }

             else if(arr[start] <= arr[mid]) {      // left sorted
                 if(arr[start] <= target &&  target <= arr[mid]){         // binary search
                     end = mid - 1;
                 } else {
                    start = mid + 1;
                 }
             }

             else {      // Right sorted
               if(arr[mid] <= target && target <= arr[end]){
                  start = mid + 1;
               }
               else {
                 end = mid - 1;
               }
             }
        }
    }
}