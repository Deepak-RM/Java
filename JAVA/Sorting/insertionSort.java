package Sorting;

public class insertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int arr[]= {7,8,3,2,9};

        //sort
        for (int i = 1; i < args.length; i++) {
            int curr=arr[i];
            int j=i-1;
            while (j>=0 && curr < arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=curr;
        }
        printArray(arr);
    }

    }


