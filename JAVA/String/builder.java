package String;

public class builder {
    public static void main(String args[]) {
        StringBuilder sb= new StringBuilder("saani");
        System.out.println(sb);
        sb.setCharAt(1, 'u');
        sb.setCharAt(2, 'n');
        System.out.println(sb);
    }
}
