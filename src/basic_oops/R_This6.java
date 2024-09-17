package basic_oops;
//this keyword can be used to return current class instance
class C{
    C getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java");
    }
}
public class R_This6 {
    public static void main(String[] args) {
        new C().getA().msg();
    }
}
