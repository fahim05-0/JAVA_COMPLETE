package ARRAY;

import java.util.Scanner;

public class DeleteInArray {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements in the array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the num you want to delete from the array :");
        int x= scanner.nextInt();

        int count=0;

        for (int i = 0; i < n; i++) {

            if(arr[i] == x) {

                count++;

            }

        }

        int[] rrr=new int[n-count];
        int j=0;

        for (int i = 0; i < n; i++)
            if (arr[i] != x) {
                rrr[j] = arr[i];
                j++;
            }
        System.out.println("New array:");
        for (int i = 0; i <rrr.length ; i++) {

            System.out.print(rrr[i]+" ");

        }

    }
}