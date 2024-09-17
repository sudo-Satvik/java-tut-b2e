package c_advance_oops;
// Java Runtime Polymorphism Example
class Bank1{
    float getRateOfInterest(){return 0;}
}
class SBI1 extends Bank1{
    float getRateOfInterest(){return 3.5f;}
}
class HDFC1 extends Bank1{
    float getRateOfInterest(){return 4.5f;}
}
public class H_PolyRun1 {
    public static void main(String[] args) {
        Bank1 b;
        b = new SBI1();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b = new HDFC1();
        System.out.println("HDFC Rate of Interest: "+b.getRateOfInterest());
    }
}
