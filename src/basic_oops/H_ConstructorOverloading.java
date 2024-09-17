package basic_oops;
class Overloading{
    Overloading(){
        System.out.println("Having no params");
    }
    int employeeId;
    String employeeName;
    Overloading(int n, String str){
        employeeId = n;
        employeeName = str;
    }
    double salary;
    Overloading(int n, double slr, String str){
        employeeId = n;
        employeeName = str;
        salary = slr;
    }
    void display(){
        System.out.println("Employee ID: "+employeeId+"\n"+"Name: "+employeeName+"\n"+"Salary: "+salary);
    }
}
public class H_ConstructorOverloading {
    public static void main(String[] args) {
        new Overloading();       // No arg constructor
        Overloading ovr2 = new Overloading(1001, "Satvik");
        Overloading ovr3 = new Overloading(1001, 100_000_000.00, "Satvik");
        ovr2.display();
        ovr3.display();
    }
}
