package basic_oops;
class Employee{
    int employeeId;
    String employeeName;
    static String companyName = "Microsoft";
    Employee(int e, String n){
        employeeId = e;
        employeeName = n;
    }
    void displayValue(){
        System.out.println("Database Microsoft: "+"\n"+"Employee ID: "+employeeId+"\n"+"Employee Name: "+employeeName+"\n"+"Company Name: "+companyName);
    }
}
public class G_Static_Variable {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Satvik Sharma");
        e1.displayValue();
    }
}
