package c_advance_oops;
// How polymorphism works in Multilevel Inheritance
class Alcohol{
    void drink(){
        System.out.println("drinking...");
    }
}
class Beer extends Alcohol{
    void drink() {
        System.out.println("beer drinking...");
    }
}
class Brocode extends Beer{
    void drink(){
        System.out.println("Brocode drinking...");
    }
}
public class H_MultilevelPoly {
    public static void main(String[] args) {
        // Parent Class
        Alcohol alcohol;
        alcohol = new Alcohol();
        alcohol.drink();
        alcohol = new Beer();
        alcohol.drink();
        alcohol = new Brocode();
        alcohol.drink();
    }
}
