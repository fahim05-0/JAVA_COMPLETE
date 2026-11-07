package LOOPS;

import java.util.Scanner;

public class Lcm {
    static void main(String[] args) {
        int a =input();
        int b=input();

        int max = Math.max(a,b);
        int i;


        for ( i = max;  ; i++) {

            if(i%a == 0 && i%b == 0) {

                break;
            }

        }
        System.out.println("your LCM is : "+i);

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
}
