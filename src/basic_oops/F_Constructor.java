package basic_oops;
class Constructor{
    Constructor(){
        System.out.println("Hello world!");
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
    }
}
public class F_Constructor {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();

    }
}
