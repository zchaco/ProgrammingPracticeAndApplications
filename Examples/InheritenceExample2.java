package bin;

import bin.Shape;
import bin.Rectangle;
import bin.Triangle;

public class InheritenceExample2 {
    public static void main(String[] args) {
        Triangle t = new Triangle("triangle", 3.0f, 4.0f);
        t.printName();
        System.out.println(t.getArea());
        Rectangle r = new Rectangle("rect", 5.0f, 6.0f);
        r.printName();
        System.out.println(r.getArea());
        Square sq = new Square("square", 3);
        sq.printName();
        System.out.println(sq.getArea());
    }
}