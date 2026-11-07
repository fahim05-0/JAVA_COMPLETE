package ARRAY;

import java.util.Scanner;

public class Merge2SortedArray {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements in the  1st array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the  1st array in increasing order:");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter num of elements in the  2nd array :");
        int m = scanner.nextInt();
        int[] brr = new int[m];
        System.out.println("Enter the elements of the  2nd array in increasing order:");

        for (int i = 0; i < m; i++) {

            brr[i] = scanner.nextInt();
        }

        int a=0 , b=0;
        int [] rrr =new int[m+n];

        for (int i = 0; i < m+n; i++) {

            if(b >= m || (a < n && arr[a] <= brr[b])){

                rrr[i]=arr[a];
                a++;

            }
            else{

                rrr[i]=brr[b];
                b++;

            }

        }

        System.out.println("NEW MERGED ARRAY:");

        for (int i = 0; i < rrr.length; i++) {

            System.out.print(rrr[i] +" ");

        }

    }
}
