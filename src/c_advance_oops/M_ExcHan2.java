package c_advance_oops;
// Finally keyword - It always runs
public class M_ExcHan2 {
    public static void main(String[] args) {
        int a = 5;
        try {
            System.out.println(a/1);
        }catch (Exception e){
            System.out.println("Error handled!");
        }finally {
            System.out.println("Muze kya mai toh hamesha run krunga!");
        }
    }
}
