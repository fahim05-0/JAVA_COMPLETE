import java.util.Scanner;

public class MultiplicationTable {

    static void main(String[] args) {

        int x =input();
        System.out.println("Table of "+ x );

        int i=1;

        while(i<=10){

            int r = i*x;
            System.out.printf("%d * %d = %d\n", i, x, r);
            i++;
        }


    }
    public static int input(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number : ");

        return scanner.nextInt();

    }
}
