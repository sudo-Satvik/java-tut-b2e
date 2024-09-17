package c_advance_oops;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employe extends Person{
    float salary;
    Employe(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }
    void display(){
//        System.out.println(STR."Hello \{name}, your age is \{age} and your salary is ₹\{salary}");
    }
}
public class E_Super4 {
    public static void main(String[] args) {
        Employe em = new Employe("Satvik", 22, 1_000_000_000f);
        em.display();
    }
}
