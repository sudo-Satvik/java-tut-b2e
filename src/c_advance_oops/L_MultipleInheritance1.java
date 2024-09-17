package c_advance_oops;
interface Parent1st{
    void print();
}
interface Parent2nd{
    void prints();
}

public class L_MultipleInheritance1 implements Parent1st, Parent2nd{
    @Override
    public void print(){
        System.out.println("hello 1st");
    }

    @Override
    public void prints() {
        System.out.println("hello 2nd");
    }

    public static void main(String[] args) {
        L_MultipleInheritance1 obj = new L_MultipleInheritance1();
        obj.print();
        obj.prints();
    }
}
