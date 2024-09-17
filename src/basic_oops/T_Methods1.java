package basic_oops;
// Access Specifier
class Public{
    public void publicSpecifier(){
        System.out.println("Accessible by any of the Class!");
    }
}
class Private{
    private void privateSpecifier(){
        System.out.println("Accessible by only this class!");
    }
}
class Protected{
    protected void protectedSpecifier(){
        System.out.println("Only been used in same package or extended or subclass!");
    }
}
class Default{
    void defaultSpecifier(){
        System.out.println("Visible only in Same Package");
    }
}
public class T_Methods1 {
    public static void main(String[] args) {
//        Private pr = new Private();
//        pr.privateSpecifier();      // Not being used here because private is used!
        Protected pr = new Protected();
        pr.protectedSpecifier();    // Used in same package

    }
}
