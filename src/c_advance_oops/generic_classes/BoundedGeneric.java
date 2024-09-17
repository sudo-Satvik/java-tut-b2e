package c_advance_oops.generic_classes;

public class BoundedGeneric {
    public static void main(String[] args) {
        doubleNum(12);
        doubleNum(12.5f);
        doubleNum(Integer.MAX_VALUE);
        doubleNum(Double.MAX_VALUE);
        doubleNum(Short.MAX_VALUE);
//        doubleNum("satvik");    // Error
    }
    private static <E extends Number> void doubleNum(E e){
        System.out.println(e);
    }
}
