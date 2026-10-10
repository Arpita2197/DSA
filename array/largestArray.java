class largestArray {
    public static void main(String[] args) {
        int [] x = {5,10,2000,100,500,1000};

         int largest = x[0];

         for(int i=1 ; i<x.length ; i++){
            if(largest < x[i]){
                largest = x[i];
            }
         }

         System.out.println(largest);
    }
}