import java.util.Scanner;

public class greatestOfTwo {
    public static void greatest(int a, int b) {
        if(a!=b) {
            if (a>b) {
                System.out.println(a+" is greater than "+b);
            }else{
                System.out.println(b+" is greater than "+a);
            }
        }else 
        System.out.println("both are equal");
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        greatest(a, b);
    }
}
