package BASICS;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Enter your age:");
        int age=scanner.nextInt();
        System.out.println(age);

        System.out.print("Enter your best friends name:");

        scanner.nextLine(); // WORKS like fflush to flush the buffer then \n from nextInt

        String name1=scanner.nextLine();
        System.out.println("Oh "+name1 +" is your best friend.");

        scanner.close();

        // P E M D A S     the bdmas rule

        int a =5;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b=5;
        System.out.println(b++); // statement a use korle age previous value ud=se kore then increment
        System.out.println(b);

        System.out.println(++b);
        System.out.println(b);


    }

}
