package basic_oops;

public class J_CounterWithStatic {
    static int count = 0;
    J_CounterWithStatic(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        J_CounterWithStatic c1 = new J_CounterWithStatic();
        J_CounterWithStatic c2 = new J_CounterWithStatic();
        J_CounterWithStatic c3 = new J_CounterWithStatic();
    }
}
