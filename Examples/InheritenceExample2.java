package p1;

import p1.Shape;
import p1.Rectangle;
import p1.Triangle;

public class InheritenceExample2 {
    public static void main() {
        Triangle t = new Triangle("triangle", 3.0f, 4.0f);
        t.printName();
        System.out.println(t.getArea());
        Rectangle r = new Rectangle("rect", 5.0f, 6.0f);
        r.printName();
        system.out.println(r.getArea());
        Square sq = new Square("square", 3);
        sq.printName();
    }
}