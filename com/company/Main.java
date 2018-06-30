
package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello hadiya");
        System.out.println("this is confusing");

        try {
            Scanner sc = new Scanner(System.in);
            /*
            String firstname  = sc.next();
            String lastname = sc.next();
            System.out.println("you entered; " + firstname + " " + lastname);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x + y;
            System.out.println("sum is " + sum);
            System.out.println("sum is " + x * y);

            int dif = x - y;
            System.out.println("sum is " + dif);
            System.out.println(5 + 3 + " is equal to 8");
            System.out.println("8 is equal to " + 5 + 3);
            System.out.println(3 + 5 + " is equal to 8");
            System.out.println("8 is equal to " + 3 + 5);
            */
            //int i = sc.nextInt();
            //for (int n = 0; n <= 50;  n++) {
            //System.out.println(i + "*" + n + "=" + (i*n));
            //
            {
                int startingNumber = sc.nextInt();
                int multiplyTill = sc.nextInt();
                int endingNumber = sc.nextInt();
                for (int n = startingNumber; n<= endingNumber; n++)
                    for (int i = multiplyTill; i >= 0; i--)
                        System.out.println(n + "*" + i + "=" + n * i);
            }
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
                for (int y = 1; y <= n2; y++)
                    System.out.println(n1 + "*" + y + "=" + n1 * y);
                for (int y = 1; y <= n2; y++)
                    System.out.println((n1 + 1) + "*" + y + "=" + ((n1 + 1) * y));
                for (int y = 1; y <= n2; y++)
                    System.out.println(n3 + "*" + y + "=" + n3 * y);
            }
            //for (int i = 0; i <= 50;  i = i+15) {
            //    System.out.println(i);
            //}


            //int x = sc.nextInt();
            //int y = sc.nextInt();
            //if(x > y)
            //System.out.println("BIGGER");
            //else if(x == y);
            //System.out.println("EQUAL");
            //else;
            //System.out.println("SMALLER");

        }catch (Exception ex) {
            ex.printStackTrace();

        }

        //      for (int i = 1; i< 10; i = i + 1) {
        //         System.out.println(i);
        //     }
    }
}