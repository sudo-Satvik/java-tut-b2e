package c_advance_oops;

public class M_ExcHan {
    public static void main(String[] args) {
        // Without exceptional handling
        int[] a = new int[5];
//        System.out.println("This will run!");
        // Exception
//        System.out.println(a[8]);
        // This won't work!
//        System.out.println("This will not work!");
        // So in order to fix that ~
        try{
            // Code which can throw the error!
            int result = 5/0;
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Areh bhai aukaat se jyada mat maang bc! ");
        }
        System.out.println("Hii");
    }
}
