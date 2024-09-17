package basic_oops;
// Creating Employees class outside main method
class Employees{
    int experienceYear = 4;
    String employeeRole = "Web Developer";
}
// Creating fields or data members within the main method
public class A_IO_OOPS {
    int employeeID = 1001;              // data member or field
    String name = "Satvik Sharma";      // data member or field
    public static void main (String[] args){
        // Initiating object
        A_IO_OOPS obj1 = new A_IO_OOPS();
        System.out.println(obj1.employeeID);
        System.out.println(obj1.name);
        //Initiating same class object multiple times
        A_IO_OOPS mulObj = new A_IO_OOPS();
        mulObj.employeeID = 2_002;
        mulObj.name = "Mayank";
        System.out.println("Employee ID: "+mulObj.employeeID+"\n"+"Name: "+mulObj.name);
        // Initiating another object
        Employees obj2 = new Employees();
        System.out.println(obj2.experienceYear);
        System.out.println(obj2.employeeRole);

        // T_Method1
        Public pc = new Public();
        pc.publicSpecifier();
    }
}
