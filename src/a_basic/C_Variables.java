package a_basic;

public class C_Variables {
    int instanceVariable = 12;      //Instance variable
//    instanceVariable = 14;          //Redeclaration is invalid here
    void methodName(){
        instanceVariable = 15;      //Redeclaration is allowed only here, within any method!
    }
    static int staticVariable = 13; //Static variable
    public void myMethod(){
        int localVariable = 14;     //Will be useful only in the block of quotes
    }
    public static void main(String[] args) {
//        System.out.println(localVariable);  //Not being accessed!
        System.out.println(staticVariable);
    }
}
