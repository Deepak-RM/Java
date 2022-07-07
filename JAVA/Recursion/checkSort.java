package Recursion;

public class checkSort {
    public static boolean compare(int arr[], int idx) {
        if (idx >= arr.length-1) {
            return true;
        }
        
        if (arr[idx]>=arr[idx+1]) {
            return false;
        }else{
            return compare(arr, idx+1);
        }
    }


    public static void main(String args[]) {
        int[] arr= {1,2,3,4,1,6};
        System.out.println(compare(arr, 0));

    }
    
}