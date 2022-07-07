import java.util.Scanner;

public class circumference {
    public static int circum(int r) {
        return (int) (2*3.14*r);
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        System.out.println("The Circumference of circle = "+circum(r));

    }
}
