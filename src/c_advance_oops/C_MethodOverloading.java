package c_advance_oops;
class Test{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class C_MethodOverloading {
    public static void main(String[] args) {
        Test ts = new Test();
        ts.sum(10, 20);
        ts.sum(10, 20, 30);
    }
}
