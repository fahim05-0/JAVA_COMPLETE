package LOOPS;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {

        int n= input();
        if(n<0)
            n=-n;
        int j=digitCounter(n)-1;
        int i=0;
        Boolean x=true;
        String num = String.valueOf(n);
        while(j>i){

            if(num.charAt(i) != num.charAt(j)){
                System.out.println("Not palindrome");
                x=false;
                break;
            }

            j--;
            i++;

        }
        if(x)
            System.out.println("Palindrome");

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
}
