package basic_oops;
class Factorial{
    void factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
public class D_Anonymous_Object {
    public static void main(String[] args) {
        new Factorial().factorial(5); // Anonymous object here
    }
}
