package LOOPS;

import java.util.Scanner;

public class ReverseNum {
    static void main(String[] args) {
        int n=input();
        int sum =0;
        boolean x=false;
        if(n<0) {
            n = -n;
            x=true;

        }
        while(n>0){

            sum=sum*10;
            sum=sum+n%10;
            n=n/10;

        }
        if(x)
            sum=-sum;
        System.out.println("Reverse num  = "+sum);


    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
}
