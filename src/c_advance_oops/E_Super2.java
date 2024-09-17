package c_advance_oops;
//super can be used to invoke parent class method
class Car2{
    void car(){
        System.out.println("Brum brum...");
    }
}
class Lamborghini extends Car2{
    void car(){
        System.out.println("Bhomm pup pup...");
    }
    void printData(){
        car();
        super.car();
    }
}
public class E_Super2 {
    public static void main(String[] args) {
        Lamborghini lc = new Lamborghini();
        lc.printData();
    }
}
