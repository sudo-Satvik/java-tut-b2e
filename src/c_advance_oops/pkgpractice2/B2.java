package c_advance_oops.pkgpractice2;
//import c_advance_oops.pkgpractice.*;    // All class name and interfaces of this package are accessible
//import c_advance_oops.pkgpractice.A1;     // Only the specific class is being imported!
public class B2 extends c_advance_oops.m_pkgpractice.A1{
    @Override
    public void msg(){
        System.out.println("Hello from same class");    // Message override is also workable!
    }
    public static void main(String[] args) {
        c_advance_oops.m_pkgpractice.A1 a = new c_advance_oops.m_pkgpractice.A1();    // this is fully qualified name and this came from that class
        a.msg();
    }
}
