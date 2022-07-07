package Recursion;

public class towerOfHanoi {
    public static void toh(int n, String src, String helper, String des) {
        if(n==1){
            System.out.println("tranfer disk "+n + " from "+src+ " to "+ des);
            return;
        }
        toh(n-1, src, des, helper) ;

        System.out.println("tranfer disk "+n + " from "+src+ " to "+ des);
        
        toh(n-1, helper, src, des);


    }
    
    public static void main(String args[]) {
        int n=2 ;
        toh(n, "S", "H ", "D");
    }
    
}
