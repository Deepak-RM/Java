import java.util.Scanner;

public class printfact{
    public static void printFact(int n) {
        if (n<0) {
            return;
        }
        int fact=1;
        for (int i = n; i >=1; i--) {
            fact=fact*i;
        }
        System.out.println("factorial is: "+fact);
        return;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printFact(n);
    }
}