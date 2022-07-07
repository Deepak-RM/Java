package Array;

import java.util.Scanner;

public class majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,2,2,1,2,1,1};
        int res=majorityElement(arr);
        System.out.println("the majority element: "+ res);
    }
    public static int majorityElement(int arr[]) {
        int majority= arr[0];
        int count =1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority) {
                count+=1;

            }else
            count-=1;

            if (count == 0) {
                majority = arr[i];
                count = 1;
            }
        }return majority;
    }
}
