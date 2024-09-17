package c_advance_oops;
//super is used to refer immediate parent class instance variable.
class Job{
    String job = "Work";
}
class Developer extends Job{
    String job = "Development";
    void printJob(){
        System.out.println(job);        // calls current class instance variable
        System.out.println(super.job);  // calls parent class instance variable
    }
}
public class E_Super1{
    public static void main(String[] args) {
        Developer d = new Developer();
        d.printJob();
    }
}
