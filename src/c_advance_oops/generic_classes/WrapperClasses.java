package c_advance_oops.generic_classes;

public class WrapperClasses {
    public static void main(String[] args) {

//        Method 1: Using the constructor of the wrapper class
//        ClassName object = new ClassName(argument);
        Integer obj = new Integer(12);
        System.out.println(obj);

//        Method 2: Using the valueOf() method provided by the Wrapper classes
//        ClassName object = ClassName.valueOf(argument);
        Integer obj2 = Integer.valueOf(12);
        System.out.println(obj2);
    }
}
