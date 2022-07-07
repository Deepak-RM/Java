package Matrix;

import java.util.Scanner;

public class spiral {
    public static void main(String agrs[]) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        int[][] Matrix= new int[r][c];

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("the spiral order matrix is : ");
        int row_start = 0;
        int row_end =r-1;
        int col_start=0;
        int col_end=c-1;
        while (row_start<= row_end && col_start <=col_end) {
            for (int col = col_start; col <= col_end; col++) {
                System.out.println(Matrix[row_start][col]+ " ");
            }row_start++;

            for (int row = row_start; row <= row_end; row++) {
                System.out.println(Matrix[row][col_end] + " ");
            }col_end--;

            for (int col = col_end ; col >= col_start; col--) {
                System.out.println(Matrix[row_end][col] + " ");
            }row_end--;

            for (int row = row_end; row >= row_start; row--) {
                System.out.println(Matrix[row][col_start] + " ");
            }col_start++;
            System.out.println();
        }
    }
}
