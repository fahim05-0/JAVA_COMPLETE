package LOOPS;

import java.util.Scanner;

public class Gcd {
    static void main(String[] args) {
        int a =input();
        int b=input();

        if(a==0 || b==0)
            System.out.println(Math.max(a,b));
        else {

            int min = Math.min(a, b);
            int i;


            for (i = min; i >= 1; i--) {

                if (a % i == 0 && b % i == 0) {

                    break;
                }

            }
            System.out.println("your GCD is : " + i);

        }

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
}
