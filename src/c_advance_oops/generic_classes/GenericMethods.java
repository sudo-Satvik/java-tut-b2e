package c_advance_oops.generic_classes;

public class GenericMethods {
    public static void main(String[] args) {
        genericMethod("Satvik");
        genericMethod(12);
        multipleGenerics(12, "Satvik");

    }
    private static <E> void genericMethod(E e){
        System.out.println(e);
    }
    private static <M, N> void multipleGenerics(M m, N n){
        System.out.println(m+" "+n);
    }
}
