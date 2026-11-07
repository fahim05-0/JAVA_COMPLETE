package ARRAY;

public class DiagonalElementSum {
    static void main(String[] args) {

        // must be square
        int [][] arr=ArrayUtility.input2D();
        int sum=0;
        int x =arr.length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <x ; j++) {

                if(i == j || i + j == x - 1){  // works for both even and odd square matrix

                    sum+=arr[i][j];
                }

            }

        }

        System.out.println("Sum of diagonal elements is = "+sum);


    }
}
