package c_advance_oops;
// Abstract Class having constructor, data members and methods(non-abstract method)
// Abstract class can have a data member, abstract method, method body, constructor, and even main() method
abstract class Car{
    Car(){
        System.out.println("Car is created!");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed!");
    }
}
// Child class which inherits the abstract class
class ChildClass extends Car{
    @Override
    void run(){
        System.out.println("running...");
    }
}
public class K_AbstractClass3 {
    public static void main(String[] args) {
        Car obj = new ChildClass();
        obj.run();
        obj.changeGear();
    }
}
