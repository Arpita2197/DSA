import java.util.Scanner;

class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //   for integer type input -----------

        //  int n = sc.nextInt();

        //  for(int i=0 ; i<n ; i++) {
        //     System.out.println(i);
        //   }

       //  for String -----------

        //   String name = sc.nextLine();
          
        //   System.out.println("Hello" + " " + name);

        // for both integer and String taking in one line so use ------

        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Dear" + " " + name +  "" +" Here is your counting : -");
        for(int i=0 ; i <n ; i++) {
            System.out.println(i);
        }

    }
}