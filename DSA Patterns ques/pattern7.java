import java.util.Scanner;

class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int space = 0;
        // int star = 1;

        //  for(int i=1 ; i<=n ; i++){
        //    // System.out.println(space + "," + star);

        //     for(int j=1 ; j<=space ; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1 ; j<=star ; j++){
        //         System.out.print("*");
        //     }        
        //      space++;

        //      System.out.println();
        //  }

        ////////// 2 logic ////////////////////////

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if(i==j) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
 
    }
}