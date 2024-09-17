package c_advance_oops;
/** Multilevel Inheritance
 * When there is a chain of inheritance then it is said to be Multilevel Inheritance.
*/
class Animal{
    void eat(){
        System.out.println("Grandparent Class");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Parent Class");
    }
}
class Labrador extends Dog{
    void lazy(){
        System.out.println("Child Class");
    }
}
public class A_Inheritance3 extends Labrador {
    public static void main(String[] args) {
        A_Inheritance3 an = new A_Inheritance3();
        an.eat();
        an.bark();
        an.lazy();
    }
}
