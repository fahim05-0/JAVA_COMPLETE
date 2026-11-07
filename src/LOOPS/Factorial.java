package LOOPS;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        int n =input();
        int r=fact(n);
        System.out.println("Factorial of "+n+" is ="+r);

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
    public  static  int fact(int n){

        if (n==1)
            return 1;

        return n*fact(n-1);

        }

    }

