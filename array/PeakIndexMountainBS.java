class PeakIndexMountainBS {

    public static void main(String[] args){

        int arr[] = {0,3,8,9,5,2};
        int start = 1;
        int end = arr.length-2;         // because peak index can't be idx != 0 and idx != last idx;

        while(start <= end){

            int mid = start + (end-start)/2;
             
              if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                 System.out.println(arr[mid]);
                 break;
              }
              else if(arr[mid-1] < arr[mid]){ // increasing order ma ha mid toh right ma search karo..
                 start = mid+1;
              }
              else {          // left search
                 end = mid-1;
              }
        }
    }
}