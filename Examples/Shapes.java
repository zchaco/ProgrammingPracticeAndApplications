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

//To Do

//Square

//Triangle

//Rectangle