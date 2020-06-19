package bin;

import bin.Triangle;
import bin.Rectangle;
//implement bin.Square


public class PolymorphismExample {
    public static void printShape(Shape s) {
        System.out.print("Shape is: ");
        s.printName();
        System.out.print("Shape area: " + s.getArea());
    }

    public static void main(String[] args) {
        
        Shape sh;

        if (args[0].equals("triangle")) {
            sh = new Triangle("tri", 5.0f,4.0f);
        }

        if (args[0].equals("rectangle")) {
            sh = new Rectangle("rect", 3.0f, 2.0f);
        }

        else {
            sh = new Rectangle("square", 4.0f, 4.0f);
        }

        printShape(sh);
    }
}