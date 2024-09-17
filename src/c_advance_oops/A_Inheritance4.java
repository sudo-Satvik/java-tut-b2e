package c_advance_oops;
/** Hierarchical Inheritance
 * When two or more classes inherits a single class, it is known as hierarchical inheritance.
 *              Animal2
 *            ^        ^
 *           /          \
 *          /            \
 *       Dog1            Cat
 * */
class Animal2{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog1 extends Animal2{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal2{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class A_Inheritance4 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog1 d = new Dog1();
        c.eat();
        c.meow();
        d.bark();
    }
}
