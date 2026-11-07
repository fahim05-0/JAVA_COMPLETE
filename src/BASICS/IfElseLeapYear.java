package BASICS;

import java.util.Scanner;

public class IfElseLeapYear {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int y;
        System.out.print("Enter your year :");
        y=scanner.nextInt();

        if(y % 400 == 0 || (y % 100 != 0 && y % 4 ==0 ) )
            System.out.println(y + " is leap year");
        else
            System.out.println("Not leap year");

        scanner.close();
    }
}
