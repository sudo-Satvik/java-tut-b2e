package c_advance_oops;
// Banking system - Abstraction
abstract class Banking{
    abstract float rateOfInterest();
}
class ICICI extends Banking{
    @Override
    float rateOfInterest() {
        return 7.0f;
    }
}
class BOB extends Banking{
    @Override
    float rateOfInterest(){
        return 8.5f;
    }
}
public class K_Abstraction2 {
    public static void main(String[] args) {
        Banking b;
        b = new ICICI();
        System.out.println("The Rate of Interest of ICICI:- "+b.rateOfInterest());
        b = new BOB();
        System.out.println("The Rate of Interest of BOB:- "+b.rateOfInterest());
    }
}
