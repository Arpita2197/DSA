class maximumSubArraySum{
    // public static void main(String[] args){

    //     int[] arr = {3,-4,5,4,-1,7,-8};
    //     int maxSum = 0;
       
    //    // Brute force approach 

    //     for(int start=0 ; start<=arr.length-1 ; start++){
    //         int currentSum = 0;
    //       for(int end=start ; end<=arr.length-1 ; end++){
    //           currentSum = currentSum + arr[end]; 
    //            if(maxSum < currentSum){
    //            maxSum = currentSum;
    //        }
    //      }
           
    //     }
    //      System.out.println("max sum of an subArray : "  + maxSum);
    // }

      public static void main(String[] args){

        int[] arr = {3,-4,5,4,-1,8,-8};
        int maxSum = 0;
       
       // more optimized (Kadane's algo) approach 

        for(int start=0 ; start<=arr.length-1 ; start++){
            int currentSum = 0;
          for(int end=start ; end<=arr.length-1 ; end++){
              currentSum = currentSum + arr[end]; 
               if(maxSum < currentSum){
               maxSum = currentSum;
           }

            if(currentSum < 0){
                currentSum = 0;
            }
         }
           
        }
         System.out.println("max sum of an subArray : "  + maxSum);
    }
}