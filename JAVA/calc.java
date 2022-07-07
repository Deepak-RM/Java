import java.util.Scanner;

public class calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1- add 2- sub 3- mul 4-div 5- mod");
        int operation = sc.nextInt();
        switch (operation) {
            case 1: System.out.println(a+b);
                
                break;
        
            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: System.out.println(a/b);
            break;

            case 5: System.out.println(a%b);
            break;
                default:
                System.out.println("Invalid operation");
                break;
        }
        
    }
    
}
