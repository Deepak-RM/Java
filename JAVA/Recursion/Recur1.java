package Recursion;

public class  Recur1 {
    public static void printNumb(int i, int n,int sum) {
        if (i>n) {
            System.out.println(sum);
            return;
        }
        sum+=i;

        printNumb(i+1,n , sum);
        }
        public static void main(String args[]) {
            int i=1,n=5;

            printNumb(i, n, 0);
        }
    }
