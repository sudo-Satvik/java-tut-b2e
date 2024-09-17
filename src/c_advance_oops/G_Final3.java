package c_advance_oops;
//A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.
public class G_Final3 {
    static final int data;
    // Static Block
    static {
        data = 50;
    }

    public static void main(String[] args) {
        System.out.println(G_Final3.data);
    }
}
