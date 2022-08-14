package java8features.functionalInterface;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        Car car = new Car();
        car.print();

    }


}

class Car implements Vehicle, FourWheeler {

    public void print() {
        System.out.println("I am a four wheeler car vehicle!");
        print2();
    }



    @Override
    public void print1() {
        FourWheeler.super.print1();
    }

    @Override
    public void print2() {
        System.out.println("this is print2 method");
    }
}

interface Vehicle {

    default void print1() {
        System.out.println("I am a vehicle!");
    }
    void print2();
}

interface FourWheeler {

    default void print1() {
        System.out.println("I am a four wheeler!");
    }
}
