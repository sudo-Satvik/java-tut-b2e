package a_basic;

public class D_TypeConv {
    // Widening = implicit or automatically type conversion
    // Narrowing = explicit or manual type conversion
    public static void main(String[] args) {

        //Widening
        int a = 10;
        long b = a;
        float c = b;

        System.out.println("Integer: "+a+"\n"+"Long of int: "+b+"\n"+"Float of long: "+c);


        float z = 10.5f;
//        long y = z;             It throws an error
        long y = (long) z;
        int x = (int) y;

        System.out.println("Integer: "+x+"\n"+"Long of int: "+y+"\n"+"Float of long: "+z);
    }
}
