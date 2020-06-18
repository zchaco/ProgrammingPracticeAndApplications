package bin; 

class Shape {
    protected String name;
    
    public Shape(String n) {
        name = n;
    }

    public void printName() {
        System.out.println(name);
    }
}

class TwoD extends Shape {
    public TwoD(String name) {
        super(name);
    }
}

class Rectangle extends TwoD {

    protected float length;
    protected float width; 

    public Rectangle(String name, float length, float width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return this.length * this.width;
    }
}

class Triangle extends TwoD {

    protected float base;
    protected float height; 
    
    public Triangle(String name, float base, float height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return (this.base * this.height) * 0.5f;
    }
}

class Square extends Rectangle {

    private float side; 
    public Square (String name, float side) {
        super(name, side, side);
        this.side = side;
    }

    public float getArea() {
        return this.side * this.side;
    }
}