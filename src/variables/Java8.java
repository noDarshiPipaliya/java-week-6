package variables;

import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {

        int first, second, add,subtract,multiply;
        float divide;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter two numbers:");
        first = Scanner.nextInt();
        second = Scanner.nextInt();

         add = first+second;
         subtract= first-second;
         multiply = first*second;
         divide = (float) first/second;

        System.out.println("sum ="+add);
        System.out.println("difference = "+subtract);
        System.out.println("multiplication ="+multiply);
        System.out.println("division ="+divide);





    }




}
