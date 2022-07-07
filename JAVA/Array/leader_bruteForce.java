package Array;

import java.util.Scanner;

public class leader_bruteForce {
    public static void main(String args[]) {
        int arr[]= {15, 18, 5, 3, 6, 2};

        leader(arr);

    }
    public static void leader(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j=i+1 ; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                break;
                }
                } 
                if (j==arr.length) {
                    System.out.println("the leaders are: "+ arr[i]);
            }
        }
       
        
    }
}
