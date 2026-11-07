package LOOPS;

import java.util.Scanner;

public class PrimeNum {
    static void main(String[] args) {
        int n = input();
        if (n<=0)
            System.out.println("invalid num");
        else if(n==1)
            System.out.println(" Not Prime number");
        else {

            prime(n);
        }

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a  positive number : ");

        return scanner.nextInt();

    }
    public static void prime(int n){
        boolean isprime =true;
        for (int i = 2; i <= n/2; i++) {

            if(n%i == 0) {
                isprime = false;
                break;
            }
        }
        if(isprime)
            System.out.println("Prime number .");
        else
            System.out.println("Not prime number .");
    }
}
