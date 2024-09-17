package c_advance_oops;
class Bank{
    void rateOfInterest(){
        System.out.println("Interest is 1%");
    }
}
class SBI extends Bank{
    void rateOfInterest(){
        System.out.println("SBI Bank Interest is 2%");
    }
}
class AXIS extends Bank{
    void rateOfInterest(){
        System.out.println("AXIS Bank Interest is 5%");
    }
}
class HDFC extends Bank{
    void rateOfInterest(){
        System.out.println("HDFC Bank Interest is 8%");
    }
}
public class D_MethodOverriding2 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        HDFC hdfc = new HDFC();
        sbi.rateOfInterest();
        hdfc.rateOfInterest();
        axis.rateOfInterest();
    }
}
