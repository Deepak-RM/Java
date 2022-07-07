package Recursion;

import javax.lang.model.element.Element;

public class removeDuplicates {
    public static boolean[] map= new boolean[26];
    public static void eliminate(String str, int idx, String newString) {
        if (idx== str.length()) {
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(idx);
        if (map[curr-'a'] == true) {
            eliminate(str, idx+1, newString);
            
        }else{
            newString += curr;
            map[curr -'a'] = true;
            eliminate(str, idx, newString);
        }
    }
    public static void main(String arg[]) {
        String str= "abbccdhsseffg";
        eliminate(str, 0, '');
        
    }

        
    }
    

