package basic_oops;
// Static method
class AnotherClass{
    static void anotherClass(){
        System.out.println("Another class");
    }
}
public class U_StaticMethod {
    static void sameClass(){
        System.out.println("Being added in the same class!");
    }

    public static void main(String[] args) {
        sameClass();
//        anotherClass();     // Not being used this method even if I add public access specifier
    }
}
