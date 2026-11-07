package ARRAY;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements in the array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }
        int j=n-1,i=0;

        while(j>i){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        System.out.println("New array:");
        for (int k = 0; k <arr.length ; k++) {

            System.out.print(arr[k]+" ");

        }


    }
}
