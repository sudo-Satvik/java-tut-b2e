package c_advance_oops;
class Test2{
    void run(){
        System.out.println("Vehicle is running");
    }
}
public class D_MethodOverriding1 extends Test2{
    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        D_MethodOverriding1 mo = new D_MethodOverriding1();
        mo.run();
    }
}
