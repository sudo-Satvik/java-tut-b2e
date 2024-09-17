package c_advance_oops.generic_classes;

public class UnBoxing {
    public static void main(String[] args) {
//        Autounboxing
        int num = Integer.valueOf(2);
//        System.out.println(num);
        Integer int1 = new Integer(2);
        int num1 = int1;    // Unboxing
        System.out.println(num1);
    }
}
