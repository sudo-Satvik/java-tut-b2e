package c_advance_oops;
// How Polymorphism works with the Data Member
class College{
    int college = 1001;
}
public class H_PolyDataMem extends College{
    int college = 1002;

    public static void main(String[] args) {
        College c = new H_PolyDataMem();
        System.out.println(c.college);
    }
}
