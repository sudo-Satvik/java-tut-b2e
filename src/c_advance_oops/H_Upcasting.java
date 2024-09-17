package c_advance_oops;
class Bike{
    void run(){
        System.out.println("running...");
    }
}
public class H_Upcasting extends Bike{
    void run(){
        System.out.println("Flying...");
    }

    public static void main(String[] args) {
        Bike b = new H_Upcasting();
        b.run();//upcasting
    }
}
