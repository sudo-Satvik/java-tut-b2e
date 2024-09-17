package c_advance_oops;
// interface example 1
interface Printable2{
    void print();
}
class A6 implements Printable2{
    @Override
    public void print() {
        System.out.println("Hello world!");
    }
}
public class L_Interface1 {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
