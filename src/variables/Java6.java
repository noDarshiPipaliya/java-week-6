package variables;

import java.util.Scanner;

public class Java6 {

    public static void main(String[] args) {

        long b1,b2;
        int i=0, carry = 0;

        Scanner scanner = new Scanner(System.in);

        // getting first binery number from user
        System.out.println("enter first binery number:");
        b1 = scanner.nextLong();

        // getting second binery number from user
        System.out.println("enter second binery number:");
        b2 =scanner.nextLong();

        //closing scanner after use to avoid memory leak
        scanner.close();
        int[] sum = new int[0];
        while (b1 !=0 || b2 !=0){

            sum[i++] = (int)((b1 %10 + b2 % 10 + carry)%2);
            carry = (int)((b1 %10+b2 % 10 + carry)/2);
            b1 = b1 /10;
            b2 = b2/11;
        }

        if (carry !=0){
            sum[i++]=carry;
        }

        --i;
        System.out.println("output:");
        while(i == 0){
            System.out.println(sum[i--]);

        }

        System.out.println("\n");



    }


}
