import java.util.Scanner;

class pattern8 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

   //  int star = 1;
   //  int space = n-1;  // n=5 , space = 4

   //   for(int i=1 ; i<=n ; i++){
   //     // System.out.println(space + "," + star);

   //     for(int j=1 ; j<=space ; j++){
   //        System.out.print(" "); 
   //     }

   //      for(int j=1 ; j<=star ; j++){
   //        System.out.print("*"); 
   //     }
       
   //      space--;
   //      System.out.println();
   //   }   

     //////////////////// 2 //////////////////////

      for(int i=1 ; i<=n ; i++) {
         for(int j=1 ; j<=n ; j++){
            if(i+j == n+1){
               System.out.print("*");
            }else{
               System.out.print("-");
            }
         }
         System.out.println();
      }
   }
}