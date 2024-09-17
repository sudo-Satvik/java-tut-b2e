package c_advance_oops;
// Downcasting can be possible by the instanceof operator
class Animal4{}
class Goat extends Animal4{
    static void methodName(Animal4 a){
        if (a instanceof Goat){
            Goat g = (Goat) a;  // downcasting
            System.out.println("Ok! Downcasting performed!");
        }
    }
}
public class I_Downcasting {
    public static void main(String[] args) {
        Animal4 a = new Goat();
        Goat.methodName(a);
    }
}
