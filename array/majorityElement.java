class majorityElement {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1};
        int arrSize = arr.length / 2;

        for(int val : arr){      // i
             int frequency = 0;
            for(int ele : arr){  // j
               if(val == ele){
                 frequency++;
               }
            }
                if(frequency > arrSize){
                System.out.println("Majority Element : " + val);
                break;
             }
        }
        
    }
}