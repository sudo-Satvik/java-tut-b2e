package c_advance_oops;
//Single Inheritance
class Human{
    void isEating(){
        System.out.println("Eating...");
    }
}
public class A_Inheritance2 extends Human{
    void isWomen(){
        System.out.println("Women...");
    }

    public static void main(String[] args) {
        A_Inheritance2 hm = new A_Inheritance2();
        hm.isWomen();
        hm.isEating();
    }
}
