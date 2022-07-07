import java.util.Scanner;

public class count {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        int n, postive=0, negative=0,zero =0;
        char choice='y';
        do {
            System.out.println("enter number:");
            n= sc.nextInt();
            if (n>0) {
                postive++;
            }if (n<0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("do you want to continue: (y/n)");
            choice= sc.next().charAt(0);


        } while (choice=='y'|| choice=='Y');
        System.out.println("postive: "+postive +"  negative: "+negative+ "  zero: "+zero);
    }
}
