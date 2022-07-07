package String;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class concatination {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String First_name= sc.nextLine();
        String Last_name= sc.nextLine();
        String full_name= First_name+ " "+ Last_name;
        System.out.println("Full name is: "+ full_name);
        System.out.println("The length of string is: "+ full_name.length());
        
        //CharAt
        for (int i = 0; i < full_name.length(); i++) {
            System.out.println(full_name.charAt(i));
        }
        //string cmp
        if (First_name.compareTo(Last_name)==0) {
            System.out.println("strings are equal");
        }else{
            System.out.println("strins are not");
        }
    }
}
