package c_advance_oops;
// Abstract Method in Java
abstract class Bike3{
    abstract void run();
}
public class K_Abstraction1 extends Bike3{
    @Override
    void run() {
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike3 obj = new K_Abstraction1();
        obj.run();
    }
}
