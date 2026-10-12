class PaintersPartition {
                                                               // mid ==> maxAllowedTime
     public static boolean isValid(int[] arr , int n , int m , int maxAllowedTime){       
        int painters = 1;
        int time = 0;

        for(int i = 0 ; i<n ; i++){
    
            if(time + arr[i] <= maxAllowedTime){
                time += arr[i];
            }
            else {
                painters++;
                time = arr[i];
            }
        }
          return painters >= m ? false : true;
     }

    public static int minTimeToPaint(int[] arr , int n , int m){
        int sum = 0;
        int maxValue = 0;

        for(int i = 0 ; i < n ; i++){
            sum += arr[i];

            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }

         int start = maxValue;
         int end = sum;
         int ans = -1;

         while(start <= end){
            
            int mid = start + (end - start)/2;

             if(isValid(arr , n , m ,mid)){    // left sorting
                ans = mid;
                end = mid-1;
             }
             else {     // right sorting
                 start = mid + 1;
             }
         }

         return ans;
    }

    public static void main(String[] args){

        int[] arr = {40,30,10,20};
        int n = 4;  // no. of boards
        int m = 2;  // no. of painters

        System.out.println(minTimeToPaint(arr , n , m));


    }
}