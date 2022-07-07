package Recursion;

public class Power {
    public static int printpow(int x, int n) {
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int xPownm1=printpow(x, n-1);
        int xPown=x*xPownm1;
        return xPown;
    }
    public static void main(String args[]) {
        System.out.println(printpow(2, 5));
    }



    
}
