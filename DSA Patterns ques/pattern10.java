import java.util.Scanner;

class pattern10 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int outerSpace = n/2 ; //2
    int innerSpace = -1;

     for(int i=1 ; i<=n ; i++){
      //  System.out.println(outerSpace + "," + innerSpace);
         for(int j=1 ; j<=outerSpace ; j++){
            System.out.print(" ");
         }

           System.out.print("*");
          
          for(int j=1 ; j<=innerSpace ; j++){
            System.out.print(" ");
          }
          
            if( i>1 && i<n){
               System.out.print("*");
            }

         if( i <= n/2){
            outerSpace--;
            innerSpace += 2 ;
         }else{
            outerSpace++;
            innerSpace -=2;
         }
         System.out.println();
     }  
     
  }
}