public class conditionals {

    public static void main(String[] args) {

        // int x = 15;

        // if(x % 2 == 0) {
        //    System.out.println("even");
        // } else {
        //     System.out.println("odd");
        // }

        // System.out.println("Hardwork is greater than smart work");


        //------------------------------------------------------------

        int x = 20;
        int y = 50;

        // if(x == y) {
        //     System.out.println("x is " + " equals to y "  );
        // }
        // else {
        //     if(x>y) {
        //         System.out.println("x is "  + "greater than Y ");
        //     }
        //     else {
        //         System.out.println(" y is " + " greater than x " );
        //     }
        // }

        //----------------- OR -----------------------
       
    //    if(x == y) {
    //      System.out.println("x is " + " equals to y "  );
    //    } 
    //    else if(x > y) {
    //      System.out.println("x is " + " greater to y "  );
    //    }
    //    else {
    //     System.out.println("x is " + " smaller to y "  );
    //    }


    //-----------------------------------------------------------------

    int marks = 90;

    if(marks > 90) {
        System.out.println("Excellent");
    } 
    else if(marks > 80 && marks < 90) {
         System.out.println("GOOD");
    } 
    else if(marks > 70 && marks < 80) {
         System.out.println(" Fair");
    }
    else if(marks > 60 && marks < 70) {
         System.out.println("More Expetations");
    }
    else {
         System.out.println("Below Par");
    }
           
    }
}