package c_advance_oops;
// Java Runtime Polymorphism Animal Example
class Animals{
    void eat(){System.out.println("eating...");}
}
class Lion extends Animals{
    void eat(){
        System.out.println("eating flesh...");
    }
}
class Cow extends Animals{
    void eat(){
        System.out.println("eating grass...");
    }
}
class Bear extends Animals{
    void eat(){
        System.out.println("eating both...");
    }
}
public class H_PolyRun2 {
    public static void main(String[] args) {
        Animals animal;
        animal = new Lion();
        animal.eat();
        animal = new Cow();
        animal.eat();
        animal = new Bear();
        animal.eat();
    }
}
