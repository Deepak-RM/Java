package OOPS;

import javax.sql.rowset.spi.SyncResolver;

class Shape {
    public void area() {
        System.out.println("printing area");
    }

}

class Triangle extends Shape {
    public void area(int length, int height) {
        System.out.println(1/2*length*height);
    }

}
class Equilateraltranngle extends Triangle{
    public void area(int l, int h) {
        System.out.println(1/2*l*h) ;
    }
}


public class Inhertance {
    public static void main ( String args[]) {
        Triangle t1= new Triangle();
        
    }
}
