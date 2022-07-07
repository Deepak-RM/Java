package Recursion;

public class Factorial {
    public static int Fact(int n) {
        if (n==1 || n==0) {
            return 1; 
        }
        int sum =n*Fact(n-1);
        return sum;
    }

    public static void main(String args[]) {
        int ans= Fact(10);
        System.out.println(ans);
    }
    
}
