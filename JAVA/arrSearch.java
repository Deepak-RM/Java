import java.util.Scanner;

public class arrSearch {
    public static void main(String srgs[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array legth");
        int n= sc.nextInt();
        int arry[]=new int[n];
        for (int i = 0; i < n; i++) {
            arry[i]=sc.nextInt();
        }
        System.out.println("number you wanna search");
        int x= sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arry[i]==x) {
                System.out.println("the index is "+ i);
            }
        }
    }
}
