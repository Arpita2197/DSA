import java.util.Arrays;

class majorityElement2 {
    public static void main(String[] args){
        int[] arr = {3,2,2,3,3};
        int arrSize = arr.length / 2;

        Arrays.sort(arr);   // 2,2,3,3,3
        int frequency = 1;
        int ans = arr[0];

        for(int i=1 ; i<arr.length; i++){
            if(arr[i] == arr[i-1] ){
                frequency++;
            }else{
                frequency = 1;
                ans = arr[i];
            }

            if(frequency > arrSize){
                System.out.println("Majority Elements : " + ans);
            }
        }
        
    }
}