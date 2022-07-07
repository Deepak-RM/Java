import java.util.Scanner;

public class MaxMin {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arry[   ]=new int[size];
        for (int i = 0; i < size; i++) {
            arry[i ]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max= arry[i];
            }
            if (arry[i]<min) {
                min=arry[i];
            }
        }

        System.out.println("max number is "+ max);
        System.out.println("min number is "+ min);

    }
}
