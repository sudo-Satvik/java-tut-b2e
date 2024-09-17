package basic_oops;
class A{
// to invoke current class method
    void n(){
//        m();                  // yeh bhi sahi h
        this.m();               // aur yeh bhi
    }
    void m(){
        System.out.println("Hello World");
    }
}
public class L_This2 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
