package ARRAY;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements in the array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }
        int j = n - 1, i = 0;
        boolean x=true;

        while (j > i) {
            if (arr[i] != arr[j]) {
                System.out.println("Not palindrome");
                x=false;
                break;
            }

            i++;
            j--;
        }
        if(x)

            System.out.println("Palindrome");
    }
}
