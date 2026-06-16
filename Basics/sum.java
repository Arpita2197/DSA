public class sum {

    public static void main(String[] args) {
        
           // x + y

        int x = 10;
        int y = 15;
        int sum = x + y;

        System.out.println("sum of " + x +  " and " + y + " is " + sum);

        // xy

        int product = x*y;
        System.out.println("product of " + x + " and " + y + " is " +  product);

        // x / y

        int v1 = 78;
        int v2 = 5;
        int divide = x/y;
        int module = v1 % v2;

        // System.out.println("division of " + v1 + " and " + v2 + " is " + divide);

        // System.out.println("division of " + v2 + " and " + v1 + " is " + divide);

        System.out.println("Module of " + v1 + " and " + v2 + " is " + module);

        // exponent :- 

        // int exp = x * y / x + y;    // 150 / 10 + 15 ==> 15 + 15 ==> 30 (wrong)

        // System.out.println(exp); // = 30 which is wrong

           // SO

       int exp = (x * y) / (x + y);

       System.out.println(exp);   // 150 / 25 == 6


    }
}