package basic_oops;
// to invoke current class constructor
// Calling default constructor from parameterized constructor
class Abcd{
    Abcd(){
        System.out.println("Hello World!");
    }
    Abcd(int x){
        this(); // For above constructor
        System.out.println(x);
    }
}
// Calling parameterized constructor from default constructor
class Abcd2{
    Abcd2(){
        this(5);
        System.out.println("Hello world!");
    }
    Abcd2(int x){
        System.out.println(x);
    }
}
public class M_This3 {
    public static void main(String[] args) {
        Abcd a = new Abcd(10);
        Abcd2 b = new Abcd2();
    }
}
