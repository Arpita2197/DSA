import java.util.Scanner;

class decimalToBinary{

   static int decToBinary(int decNum){
     int ans = 0;
     int pow = 1;
      
      while(decNum > 0){
        int rem = decNum % 2;
         decNum = decNum / 2;

         ans+= rem * pow;
          pow = pow * 10;
         
      }
         return ans;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       System.out.println(decToBinary(n));

    }
}