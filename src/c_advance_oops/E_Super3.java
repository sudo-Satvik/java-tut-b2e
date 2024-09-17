package c_advance_oops;
class Insect{
    Insect(){
        System.out.println("Insect is created!");
    }
}
class Cockroach extends Insect{
    Cockroach(){
        super();            // If we remove super() from here then it will also work
        System.out.println("Cockroach is created!");
    }
}
public class E_Super3 {
    public static void main(String[] args) {
        Cockroach ins = new Cockroach();
    }
}
