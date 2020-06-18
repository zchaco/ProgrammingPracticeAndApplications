public class InheritenceExample1 {
    public static void main(String[] args) {
        Car myCar = new Car(2);
        myCar.setIsConvertible(true);
        System.out.println("My car is a convertible: " + myCar.getIsConvertible());
        System.out.println("My car has this many doors: " + myCar.getNumberOfDoors());

        Truck myTruck = new Truck(4);
        System.out.println("My truck has this many doors: " + myTruck.getNumberOfDoors());

    }
}

class Vehicle {

    protected int numberOfDoors;
    
    public Vehicle(int n) {
        numberOfDoors = n;

    }
    
    protected int getNumberOfDoors() {
        return this.numberOfDoors;
    }

}

class Car extends Vehicle {

    private boolean isConvertible;

    public Car(int n) {
        super(n);
    }

    public void setIsConvertible(boolean b) {
        isConvertible = b;
    }
    public boolean getIsConvertible() {
        return this.isConvertible;
    }
}

class Truck extends Vehicle {
    private boolean isMonster;

    public Truck(int n) {
        super(n);
    }

    public void setIsMonster(boolean b) {
        isMonster = b;
    }
}