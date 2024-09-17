package basic_oops;
// Counter without static variable
public class I_CounterWithoutStatic {
    // creating instance variable
    int count = 0;
    I_CounterWithoutStatic(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        I_CounterWithoutStatic c1 = new I_CounterWithoutStatic();
        I_CounterWithoutStatic c2 = new I_CounterWithoutStatic();
        I_CounterWithoutStatic c3 = new I_CounterWithoutStatic();
    }
}
