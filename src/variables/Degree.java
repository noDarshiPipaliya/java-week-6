package variables;

import java.util. Scanner;


public class Degree {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter 1 to convert from Celcius to Fahrenhit");
        int choice = scan.nextInt();

        double tempereture = 0.0;
        double converted = 0.0;

        if(choice==1) {
            System.out.println("Enter the temperature in Fahrenhit.");
            tempereture = scan.nextDouble();
            converted = 5 / 9.0 * (tempereture - 32);
            System.out.println("Tempereture in Celcius=" + converted);
        }
    }



}
