package basic_oops;
class Parameterized{
    Parameterized(int num){
        System.out.println(num);
    }
}
public class G_ParamConstructor {
    public static void main(String[] args) {
        Parameterized pc = new Parameterized(10);
    }
}
