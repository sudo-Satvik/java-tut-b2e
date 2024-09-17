package c_advance_oops;
//This is how inheritance works
// Consider I have a company and 10 employees. I want to give bonus to those who are programmer.
class Employee{
    double salary = 1_000_000.00;
}
public class A_Inheritance1 extends Employee{
    double bonus = salary+salary * 25/100;
    public static void main(String[] args) {
        A_Inheritance1 programmer = new A_Inheritance1();
        System.out.println(programmer.bonus);
    }
}
