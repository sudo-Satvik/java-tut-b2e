package basic_oops;
class InstanceMethod{
    public int sum(int a, float b){
        return (int)(a+b);
    }
}
public class V_InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod im = new InstanceMethod();   // Unlike static class, we need to init object in order to invoke
        System.out.println(im.sum(10,15));
    }
}
