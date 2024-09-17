package basic_oops;
// this: to pass as an argument in the method
class ArgMethod{
    void m(ArgMethod st){
        System.out.println("Method is been invoked!");
    }
    void p(){
        m(this);
    }
}
public class P_This4 {
    public static void main(String[] args) {
        ArgMethod am = new ArgMethod();
        am.p();
    }
}
