package ARRAY;

import java.util.Scanner;

public class ArrayUtility {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray() {
        System.out.print("Enter num of elements in the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    public static void display(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    public static int[][] input2D() {
        System.out.print("Enter dimensions of your 2D array:");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        return arr;
    }

    public static void display2D(int[][] arr) {
        for (int[] row : arr)
            display(row);
    }

}
