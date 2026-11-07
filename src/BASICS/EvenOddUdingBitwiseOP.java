package BASICS;

import java.util.Scanner;

public class EvenOddUdingBitwiseOP {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :");
        int x = scanner.nextInt();



        if ((x & 1) == 0)
            System.out.println(x + " is Even");
        else
            System.out.println(x + " is Odd");

        scanner.close();


    }


}
