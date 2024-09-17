package c_advance_oops;
class Parent
{
    Parent()
    {
        System.out.println("Constructor from the Parent Class");
    }
}
class Child extends Parent
{
    Child()
    {
//        super();
        System.out.println("Constructor of the Child class");
    }
    {
        System.out.println("Constructor of the Instance Initializer Block");
    }
    {
        System.out.println("Another Instance Initializer Block");
    }
}
public class F_IIB1
{
    public static void main(String[] args)
    {
        Child ch = new Child();
    }
}
