package c_advance_oops;
// example of covariant return type
class X{
    X method()
    {
        System.out.println("Learn coding");
        return this;        // this --> new X();
    }
}
class Y extends X{
    @Override
    Y method()
    {
        super.method();
        System.out.println("Hello world");
        return this;
    }
}
public class J_Covariant {
    public static void main(String[] args) {
        Y x = new Y();
        x.method();
    }
}
