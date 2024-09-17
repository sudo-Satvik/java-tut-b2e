package c_advance_oops.n_encapsulation;
// In this class we'll read and write the encapsulated class
public class RW {
    public static void main(String[] args) {
        Stud st = new Stud();
        System.out.println(st.getName());
        st.setName("Satvik");
        System.out.println(st.getName());
    }
}
