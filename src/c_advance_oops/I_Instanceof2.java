package c_advance_oops;
// Another instanceof example
class Animal3{}
class Elephant extends Animal3{}
public class I_Instanceof2 {
    public static void main(String[] args) {
        Animal3 ep = new Elephant();
        System.out.println(ep instanceof Animal3);
    }
}
