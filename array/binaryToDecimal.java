import java.util.Scanner;

class binaryToDecimal{

    static int binToDecimal(int binNum){
        int ans = 0;
        int pow = 1;

        while(binNum > 0){
            int rem = binNum % 10;
            ans+= rem * pow;
            binNum = binNum / 10;
            pow = pow * 2; 
        }
           return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       System.out.println(binToDecimal(n));
    }
}


