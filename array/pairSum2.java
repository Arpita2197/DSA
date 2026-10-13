class pairSum2{

    // optimized code ----> O(n)
    public static void main(String[] args){

        int[] arr = {2,7,11,15};
        int target = 26;
        
        int i=0;
        int j = arr.length-1;

        while(i < j){
            int PS = arr[i] + arr[j];

             if(PS < target){
                i++;
             }else if(PS > target){
                j--;
             }else{
                System.out.println(arr[i] + "," + arr[j]);
                break;
             }

        }

    }
}