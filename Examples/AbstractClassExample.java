//Implement abstract parent class

//Implement Child class that inherits from Parent



public class AbstractClassExample {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.exampleMethod1());
        System.out.println(c.exampleMethod2());
        Parent p = new Parent();
        System.out.println(p.exampleMethod1());
        System.out.println(p.exampleMethod2());
    }
}