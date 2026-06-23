import java.util.Scanner;

class pattern14 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           
        for(int i=1 ; i<=10 ; i++){
            int x = n;
            System.out.println( x + "*" + i  + " = " + x * i );
        }

     
    }
}