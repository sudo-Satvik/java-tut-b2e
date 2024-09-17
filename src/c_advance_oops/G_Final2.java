package c_advance_oops;
// We can't override the final method
// But we can overload the final method
class Parent1{
    final void displayMsg(int a, int b){
        System.out.println(a+b);
    }
    void displayMsg(){
        System.out.println("Hello World");
    }
}
public class G_Final2 extends Parent1{
//    void displayMsg() {
//        System.out.println("Hello from the child");
//    }

    public static void main(String[] args) {
        G_Final2 gFinal2 = new G_Final2();
        gFinal2.displayMsg(3,4);
        gFinal2.displayMsg();
    }
}
