package LOOPS;

import java.util.Scanner;

public class Fibonachhi {
    static void main(String[] args) {
        int n=input();

        System.out.println(n+" th fibonachhi teerm is :");
        fibo(n);

    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number of the term needed : ");

        return scanner.nextInt();


    }
    public static void fibo(int n){
        if(n<=0){
            System.out.println("Invalid num of terms");
            return;
        }
        System.out.print("0 ");
        if(n==1) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        int count = 2;

        while(count < n){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
            count++;
        }
    }
}
