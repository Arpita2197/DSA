class MergeTwoSortedArrays {

    public static void main(String[] args){
        int[] a = {1,2,3,0,0,0};
        int m = 3;
        int[] b = {2,5,6};
        int n = 3;

         int idx = m+n-1;
         int i = m-1;
         int j = n-1;

         while(i >=0 && j >= 0){
            if(a[i] > b[j]) {
                a[idx] = a[i];
                idx--;
                i--;
            }
            else{
                a[idx] = b[j];
                 j--;
                 idx--;
            }
         }

         while(j >= 0){             // case ==> agar i ka elements khtm ho gay aur i = -1 ho gaya 
                                  // but j ma elements bacha ha toh , j ka elemnts ko copy kar do array ma
            a[idx] = b[j];
             idx--;
             j--;
         }

         for(int k = 0; k <= a.length-1 ; k++){
            System.out.println(a[k]);
         }
    }
}