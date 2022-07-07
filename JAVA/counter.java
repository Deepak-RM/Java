import java.util.Scanner;

public class counter {
    public static void main(String agr[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0,sum=0;
        while (i<=n) {
            sum=i+sum;
            i++;
            
        }System.out.println(sum);
        }
        
    }
    
