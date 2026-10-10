class linearSearch{

  static int linearSrch(int arr[] , int size , int target) {
       for(int i = 0 ; i<size-1 ; i++){
         if(arr[i] == target){
            return i;
         }
       }

       return -1;
   }

    public static void main(String[] args){

    int [] arr = {4,2,7,8,1,2,5};
    int size = 7;
    int target = 8;
      
      System.out.println(linearSrch(arr , size , target));
       
    }
}