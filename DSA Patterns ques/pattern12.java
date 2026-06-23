import java.util.Scanner;

class pattern12{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int a = 0;
         int b = 1;
         int ans = 0;

          for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                 
                System.out.print(a + " ");
                ans = a + b ;
                 a = b;
                 b = ans;
                 
            }
             System.out.println();
          }

         
    }
}