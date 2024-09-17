package basic_oops;
// Abstract Class method
abstract class Demo{
    abstract int absMet();
}
public class Y_AbstractClass extends Demo{
    int absMet(){
        return 1+1;
    }

    public static void main(String[] args) {
        Y_AbstractClass abstractClass = new Y_AbstractClass();
        int ans = abstractClass.absMet();
        System.out.println(ans);
    }
}
