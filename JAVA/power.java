import java.util.Scanner;

public class power {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number and power");
        int x=sc.nextInt();
        int n= sc.nextInt();
        int value=1;
        for (int i = 1; i <=n; i++) {
            value *=x;
        }System.out.println("the value: "+value);
    }
}
