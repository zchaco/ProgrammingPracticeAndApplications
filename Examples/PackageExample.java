public class PackageExample {

    public void method1() {
        System.out.println("This class is not in a package");

    }
    public static void main(String[] args) {
        PackageExample p1 = new PackageExample();
        p1.method1();
    }
}