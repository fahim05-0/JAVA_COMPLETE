package LOOPS;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        int n=input();
        int digit=digitCounter(n);

        isArmstrong(n,digit);

    }

    public  static int digitCounter(int n){

        int i;

        for ( i = 1; n > 0; i++) {

            n/=10;

        }

        return i-1;

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
    public  static void isArmstrong(int n , int digit){

        int sum =0;
        int num=n;

        while(n>0){

            int r=n%10;
            sum+=Math.pow(r,digit);
            n/=10;

        }

        if(num==sum)
            System.out.println(num+" is a armstrong number.");
        else
            System.out.println("Not a armstrong number");

    }
}
