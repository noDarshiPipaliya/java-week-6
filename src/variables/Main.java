package variables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // create a scanner object
        int num1, num2;

        System.out.println("10");
        Scanner scan = null;
        num1 = scan.nextInt();
        System.out.println("20");
        num2 = scan.nextInt();


        String userName = obj.nextLine(); // read user input

        int a = num1 + num2;
        int b = num1 - num2;
        int c = num1 * num2;
        int d = num1 / num2;

        System.out.println("Addition result = " + a);
        System.out.println("Substraction result =" + b);
        System.out.println("Multiplication result =" + c);
        System.out.println("Division result =" + d);

    }


}






