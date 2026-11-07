package LOOPS;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {

        int n=input();
        int sum =0;
        if(n<0)
            n=-n;
        while(n>0){



            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of the digits is = "+sum);

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a  number : ");

        return scanner.nextInt();

    }

}
