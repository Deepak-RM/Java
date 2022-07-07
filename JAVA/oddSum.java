import java.util.Scanner;

public class oddSum {
    public static int odd (int n) {
        int sum=0;
        for (int i = 1; i <=n; i+=2) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Sum of Odd numbers from 1 to n = "+ odd(5));
    }
}
