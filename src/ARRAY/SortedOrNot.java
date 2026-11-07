package ARRAY;

import java.util.Scanner;

public class SortedOrNot {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements in the array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        boolean i =inceasing(n,arr);
        boolean d=deceasing(n,arr);

        if(i || d)
            System.out.println("Sorted array");
        else
            System.out.println("Not sorted array");

    }
    public  static boolean inceasing(int n ,int[] arr){
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1])
                return false;

        }

        return true;
    }
    public  static boolean deceasing(int n ,int[] arr){
        for (int i = 0; i < n-1; i++) {
            if(arr[i] < arr[i+1])
                return false;

        }

        return true;
    }
}
