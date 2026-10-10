class majorityElement3 {
      public static void main(String[] args){
        int[] arr = {1,2,2,1,2};
        int frequency = 0;
        int ans = 0;
       
        // Moores voting algo------
        for(int i=0 ; i<arr.length ; i++){
             if(frequency == 0){
                ans = arr[i];
             }
              if(ans == arr[i]){
                 frequency++;
              }else{
                frequency--;
              }
         }

         System.out.println("Majority Element : " + ans);
      }
}