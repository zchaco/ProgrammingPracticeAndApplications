interface Parent {
    public int method1();

}

abstract class Child implements Parent {
    public abstract int method2();
    public int method1() {
        return 20;
    }
}

class GrandChild extends Child {
    public int method2() {
        return 30;
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(gc.method1()); //method1 should return 20
        System.out.println(gc.method2()); //method 2 should return 30
        
        Child c = new Child();
        System.out.println(c.method1()); //method1 should return 20
        System.out.println(c.method2());
        
    }
}