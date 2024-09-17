package basic_oops;
// this: to pass as argument in the constructor call
class B{
    Q_This5 obj;
    B(Q_This5 obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj.data);
    }
}
public class Q_This5 {

    int data = 10;
    Q_This5(){
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
        Q_This5 q = new Q_This5();
    }
}
