package c_advance_oops;
// How throws work!
public class M_Throws {
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            System.out.println(getValue(a));
        }catch (Exception e){
            System.out.println("Handled!");
        }
    }
    public static int getValue(int[] a) throws ArrayIndexOutOfBoundsException{      // Tells ki yahi error hoskta h
        return a[8];
    }
}
