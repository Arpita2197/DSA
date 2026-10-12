class pairSum{

   static void PairSum(int arr[] ,int target){
      for(int i=0 ; i<arr.length ; i++){
        for(int j=i+1 ; j<arr.length ; j++){
            if(arr[i] + arr[j] == target){
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
      }
   }

    public static void main(String[] args){
        int target = 26;
        int[] arr = {2,7,11,15};

         PairSum(arr , target);


    }
}