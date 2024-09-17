package c_advance_oops.generic_classes;
// Difference between both methods of declaring Wrapper Classes
public class WrapperClasses2 {
    public static void main(String[] args) {
//        Method One here
        Integer num1 = new Integer(1);
        Integer num2 = new Integer(1);
        boolean ansFirst = num1 == num2;

//        Method Two here
        Integer num3 = Integer.valueOf(2);
        Integer num4 = Integer.valueOf(2);
        boolean ansSecond = num3 == num4;

        System.out.println("First method response: "+ansFirst);
        System.out.println("Second method response: "+ansSecond);
    }
}
