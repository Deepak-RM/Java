import java.util.Scanner;

public class avg {
    public static void avgThreeNo(int a, int b, int c) {
         System.out.println("avg of 3 numbers: "+(a+b+c)/3);
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avgThreeNo(a, b, c);
    }
}
