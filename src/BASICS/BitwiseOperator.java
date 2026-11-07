package BASICS;

import java.awt.*;
import java.util.Scanner;


public class BitwiseOperator {
    static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter num 1 :");

        int first =scanner.nextInt();

        System.out.print("Enter num 2 :");

        int second =scanner.nextInt();
        int result= first&second;
        System.out.println("Bitwise AND is :"+result);
        int result2 =first | second;
        System.out.println("Bitwise OR is :"+result2);
        int result3 =first ^ second;
        System.out.println("Bitwise XOR is :"+result3);


        int result4 =~first;
        System.out.println("Bitwise not of first num is :"+result4);
        int result5 =first << 3; // left shift it 3 position num << unit of shifting
        System.out.println("Bitwise leftshift 3 place of 1st num is :"+result5);
        int result6 =second >> 10;
        System.out.println("Bitwise rightshift 2 place  of second num is :"+result6);





        scanner.close();



    }
}
