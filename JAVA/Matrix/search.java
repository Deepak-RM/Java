package Matrix;

import java.util.Scanner;

public class search {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        int[][] Matrix= new int[r][c];

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                Matrix[i][j]=sc.nextInt();
            }
        }
        int x= sc.nextInt();

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                if (Matrix[i][j] == x) {
                    System.out.println("the row and col is: (" + i + ","+ j + ") ");
                }
            }
        }

    }
}
